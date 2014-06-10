package com.bragon;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

import com.Wsdl2Code.WebServices.PublicPortalServiceJSON.*;

import android.content.Context;
import android.widget.Toast;

public class PSApi {
	private Context ctx;
	private String server;
	private PublicPortalServiceJSON login;

	public PSApi(Context ctx, String server) {
		this.ctx = ctx;
		this.server = server;

		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("pearson", "m0bApP5"
						.toCharArray());
			}
		});

		login = new PublicPortalServiceJSON();
		login.setUrl(server);
	}

	public boolean login(String username, String password) {
		ResultsVO res = login.login(username, password, 2, true);
		
		if (res == null)
			Toast.makeText(ctx, "failed to login", Toast.LENGTH_SHORT).show();
		else
			Toast.makeText(ctx,
					"logged in as " + res.studentDataVOs.firstElement().student.firstName,
					Toast.LENGTH_SHORT).show();

		return res == null;

	}
}
