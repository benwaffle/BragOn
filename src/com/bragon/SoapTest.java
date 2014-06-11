package com.bragon;

import org.ksoap2.*;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.*;

import android.content.Context;
import android.widget.Toast;

public class SoapTest {
	Context ctx;
	
	final static String namespace = "http://axisversion.sample/";
	final static String url = "https://ps01.bergen.org/pearson-rest/services/Version?wsdl";
	final static String method = "getVersion";
	final static String soap_action = namespace + method;
	
	public SoapTest(Context ctx) {
		this.ctx = ctx;
		
		SoapObject request = new SoapObject(namespace, method);
		SoapSerializationEnvelope env = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		env.setOutputSoapObject(request);
		
		HttpTransportSE http = new HttpTransportSE(url);
		http.debug = true;
		
		try {
			http.call(soap_action, env);
			String result = env.getResponse().toString();
			
			Toast.makeText(ctx, "result: " + result, Toast.LENGTH_LONG).show();
		} catch (Exception e) {
			Toast.makeText(ctx, "error: " + e.getMessage(), Toast.LENGTH_LONG).show();
		}
	}
}
