package com.bragon;

import org.ksoap2.*;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.HttpTransportSE;

import android.content.Context;
import android.widget.Toast;

public class SoapTest {
	String server;
	Context ctx;
	
	final static String namespace = "http://axisversion.sample/";
	final static String url = "https://ps01.bergen.org/pearson-rest/services/Version?wsdl";
	final static String method = "getVersion";
	final static String soap_action = namespace + method;
	
	public SoapTest(Context ctx, String server) {
		this.server = server;
		this.ctx = ctx;
		
		SoapObject request = new SoapObject(namespace, method);
		SoapSerializationEnvelope env = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		env.setOutputSoapObject(request);
		HttpTransportSE http = new HttpTransportSE(url);
		try {
			http.call(soap_action, env);
		} catch (Exception e) {
			Toast.makeText(ctx, "failed to contact PS", Toast.LENGTH_LONG).show();
		}
		
		try {
			SoapPrimitive result = (SoapPrimitive) env.getResponse();
			Toast.makeText(ctx, "response: " + result.toString(), Toast.LENGTH_LONG).show();
		} catch (SoapFault e) {
			Toast.makeText(ctx, "failed to get response from PS", Toast.LENGTH_LONG).show();
		}
	}

	public boolean login(String username, String password) {
		return false;
	}
}
