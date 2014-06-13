package com.bragon;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.*;
import android.widget.*;
import android.view.View;

public class LoginActivity extends Activity implements View.OnClickListener {

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

		psLogin = (Button) findViewById(R.id.psLogin);
		fbLogin = (Button) findViewById(R.id.fbLogin);
		psU = (EditText) findViewById(R.id.psUsername);
		psP = (EditText) findViewById(R.id.psPassword);
		fbU = (EditText) findViewById(R.id.fbEmail);
		fbP = (EditText) findViewById(R.id.fbPassword);

		if (psuname != null && pspass != null){
			psU.setText(psuname);
			psP.setText(pspass);
		}
		
		psapi = new PSApi();
		
		psLogin.setOnClickListener(this);
		fbLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.psLogin) {
			savedPrefs
				.edit()
				.putString("psuname", psU.getText().toString())
				.putString("pspass", psP.getText().toString())
				.apply();
			
			if(psapi.login(psU.getText().toString(), psP.getText().toString())){
				Toast.makeText(this, "success...getting data", Toast.LENGTH_LONG).show();
				if (psapi.getStudentData() == null)
					Toast.makeText(this, "failed to get studentData", Toast.LENGTH_LONG).show();
				else
					Toast.makeText(this, "successfully got studentData", Toast.LENGTH_LONG).show();
			} else
				Toast.makeText(this, "failure", Toast.LENGTH_LONG).show();
		} else if (v.getId() == R.id.fbLogin) {

		}
	}
}