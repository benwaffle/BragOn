package com.bragon;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.ByteBuffer;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.*;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.scheme.*;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.*;
import org.apache.http.impl.client.*;
import org.apache.http.impl.conn.*;
import org.apache.http.params.*;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.PublicPortalServiceJSON;

public class PSApi {
	private Context ctx; // for toasts
	private PublicPortalServiceJSON soap;

	final String loginFormat = "<?xml version=\"1.0\" ?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Body><ns2:login xmlns:ns2=\"http://publicportal.rest.powerschool.pearson.com/xsd\"><username>%s</username><password>%s</password><userType>2</userType></ns2:login></S:Body></S:Envelope>";

	public PSApi(Context ctx, String server) {
		this.ctx = ctx;
		soap = new PublicPortalServiceJSON();
		soap.setUrl(server);
	}

	public void login(final String username, final String password) {
		// ResultsVO ret = soap.login(username, password, 2, true);
		Object ret = null;
		try {

			//pearson:m0bApP5

			HttpResponse resp = connect(String.format(loginFormat, username, password), "urn:login");
			
			Log.d("com.bragon", "response code: " + resp.getStatusLine().getStatusCode());
			InputStream is = resp.getEntity().getContent();

			StringBuilder sb = new StringBuilder();
			byte[] buf = new byte[1024];
			while (is.read(buf) != -1)
				sb.append(new String(buf));

			Log.d("com.bragon", "return data: " + sb);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (ret == null)
			Toast.makeText(ctx, "error with powerschool", Toast.LENGTH_LONG).show();
		else
			Toast.makeText(ctx, "successful login " + ret, Toast.LENGTH_LONG).show();
	}

	private HttpResponse connect(String data, String soapaction) {
		try {
			SchemeRegistry schemeRegistry = new SchemeRegistry();
			schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
			HttpParams params = new BasicHttpParams();
			SingleClientConnManager mgr = new SingleClientConnManager(params,
					schemeRegistry);

			HttpClient client = new DefaultHttpClient(mgr, params);

			HttpPost post = new HttpPost("https://ps01.bergen.org/pearson-rest/services/PublicPortalServiceJSON");
			
			final AuthScope scope = new AuthScope(post.getURI().getHost(), post.getURI().getPort());
			final UsernamePasswordCredentials creds = new UsernamePasswordCredentials("pearson", "m0bApP5");
			HttpContext ctx = new BasicHttpContext(){{
				setAttribute(ClientContext.CREDS_PROVIDER,
						new BasicCredentialsProvider(){{
							setCredentials(scope, creds);
						}});
			}};
			
			post.setHeader("Content-Type", "text/xml; charset=utf-8");
			post.setHeader("SOAPAction", "\"" + soapaction + "\"");
			post.setEntity(new StringEntity(data));
			
			return client.execute(post, ctx);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
