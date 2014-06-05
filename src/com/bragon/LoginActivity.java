package com.bragon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

	Activity me = this;
	private Button psLogin, fbLogin;
	private EditText psU, psP, fbU, fbP;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		psLogin = (Button)findViewById(R.id.psLogin);
		fbLogin = (Button)findViewById(R.id.fbLogin);
		psU = (EditText)findViewById(R.id.psUsername);
		psP = (EditText)findViewById(R.id.psPassword);
		fbU = (EditText)findViewById(R.id.fbEmail);
		fbP = (EditText)findViewById(R.id.fbPassword);	
	}
}
