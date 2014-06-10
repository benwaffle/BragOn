package com.bragon;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class LoginActivity extends Activity implements View.OnClickListener {

	Activity me = this;
	private Button psLogin, fbLogin;
	private EditText psU, psP, fbU, fbP;
	private SharedPreferences savedPrefs;
	private PSApi psapi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		savedPrefs = getSharedPreferences("bragon_prefs", MODE_PRIVATE);
		String psuname = savedPrefs.getString("psuname", null), pspass = savedPrefs
				.getString("pspass", null);

		if (psuname != null || pspass != null)
			finish();

		psLogin = (Button) findViewById(R.id.psLogin);
		fbLogin = (Button) findViewById(R.id.fbLogin);
		psU = (EditText) findViewById(R.id.psUsername);
		psP = (EditText) findViewById(R.id.psPassword);
		fbU = (EditText) findViewById(R.id.fbEmail);
		fbP = (EditText) findViewById(R.id.fbPassword);

		psapi = new PSApi(this, "https://ps01.bergen.org");
		
		psLogin.setOnClickListener(this);
		fbLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.psLogin) {

//			if (
					psapi.login(psU.getText().toString(), psP.getText().toString());
//							) {
//				Toast.makeText(this, "ps login successful....?",
//						Toast.LENGTH_LONG).show();
//			} else {
//				Toast.makeText(this, "failed to login to powerschool",
//						Toast.LENGTH_LONG).show();
//			}
		} else if (v.getId() == R.id.fbLogin) {
			// Toast.makeText(this, fbU.getText() + ":" + fbP.getText(),
			// Toast.LENGTH_SHORT).show();
		}
	}
}