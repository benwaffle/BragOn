package com.bragon;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.*;

import android.content.Context;
import android.widget.Toast;

public class PSApi {
	private Context ctx; // for toasts
	private PublicPortalServiceJSON soap;

	static {
		Authenticator.setDefault(new Authenticator() { 
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(
						"pearson", "m0bApP5".toCharArray());
			}
		});
	}
	
	public PSApi(Context ctx, String server) {
		this.ctx = ctx;
		soap = new PublicPortalServiceJSON();
		soap.setUrl(server);
	}

	public void login(final String username, final String password) {
		ResultsVO ret = soap.login(username, password, 2, true);
		
		if (ret == null)
			Toast.makeText(ctx, "error with powerschool", Toast.LENGTH_LONG).show();
		else
			Toast.makeText(ctx, "successful login " + ret, Toast.LENGTH_LONG).show();
	}
}
