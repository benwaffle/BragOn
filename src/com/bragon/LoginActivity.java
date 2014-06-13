package com.bragon;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.Session;
import com.facebook.SessionState;

public class LoginActivity extends FragmentActivity implements View.OnClickListener {
	
	private boolean isResumed = false;

	private Button psLogin, fbLogin;
	private EditText psU, psP, fbU, fbP;
	private SharedPreferences savedPrefs;
	private PSApi psapi;
	
	private static final int SPLASH = 0;
	private static final int SELECTION = 1;
	private static final int FRAGMENT_COUNT = SELECTION +1;

	private Fragment[] fragments = new Fragment[FRAGMENT_COUNT];
	
	//private UiLifecycleHelper uiHelper;
	private Session.StatusCallback callback = 
	    new Session.StatusCallback() {
	    @Override
	    public void call(Session session, 
	            SessionState state, Exception exception) {
	        onSessionStateChange(session, state, exception);
	    }
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//uiHelper = new UiLifecycleHelper(this, callback);
	    //uiHelper.onCreate(savedInstanceState);
		System.out.println("AKDHFSLKFSKHFKJSDH");
		
		setContentView(R.layout.activity_login);
		
		savedPrefs = getSharedPreferences("bragon_prefs", MODE_PRIVATE);
		String psuname = savedPrefs.getString("psuname", null), pspass = savedPrefs
				.getString("pspass", null);

		psLogin = (Button) findViewById(R.id.psLogin);
		psU = (EditText) findViewById(R.id.psUsername);
		psP = (EditText) findViewById(R.id.psPassword);

		if (psuname != null && pspass != null){
			psU.setText(psuname);
			psP.setText(pspass);
		}
		
		psapi = new PSApi(this, "https://ps01.bergen.org");
		
		psLogin.setOnClickListener(this);
		
		// Facebook login
		
		FragmentManager fm = getSupportFragmentManager();
	    fragments[SPLASH] = fm.findFragmentById(R.id.splashFragment);
	    fragments[SELECTION] = fm.findFragmentById(R.id.selectionFragment);

	    FragmentTransaction transaction = fm.beginTransaction();
	    for(int i = 0; i < fragments.length; i++) {
	        transaction.hide(fragments[i]);
	    }
	    transaction.commit();
		
	}
	
	private void showFragment(int fragmentIndex, boolean addToBackStack) {
	    FragmentManager fm = getSupportFragmentManager();
	    FragmentTransaction transaction = fm.beginTransaction();
	    for (int i = 0; i < fragments.length; i++) {
	        if (i == fragmentIndex) {
	            transaction.show(fragments[i]);
	        } else {
	            transaction.hide(fragments[i]);
	        }
	    }
	    if (addToBackStack) {
	        transaction.addToBackStack(null);
	    }
	    transaction.commit();
	}
	
	@Override
	public void onResume() {
	    super.onResume();
	    //uiHelper.onResume();
	    isResumed = true;
	}

	@Override
	public void onPause() {
	    super.onPause();
	    //uiHelper.onPause();
	    isResumed = false;
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    //uiHelper.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onDestroy() {
	    super.onDestroy();
	    //uiHelper.onDestroy();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
	    super.onSaveInstanceState(outState);
	    //uiHelper.onSaveInstanceState(outState);
	}
	
	private void onSessionStateChange(Session session, SessionState state, Exception exception) {
	    // Only make changes if the activity is visible
	    if (isResumed) {
	        FragmentManager manager = getSupportFragmentManager();
	        // Get the number of entries in the back stack
	        int backStackSize = manager.getBackStackEntryCount();
	        // Clear the back stack
	        for (int i = 0; i < backStackSize; i++) {
	            manager.popBackStack();
	        }
	        if (state.isOpened()) {
	            // If the session state is open:
	            // Show the authenticated fragment
	            showFragment(SELECTION, false);
	        } else if (state.isClosed()) {
	            // If the session state is closed:
	            // Show the login fragment
	            showFragment(SPLASH, false);
	        }
	    }
	}
	
	@Override
	protected void onResumeFragments() {
	    super.onResumeFragments();
	    Session session = Session.getActiveSession();

	    if (session != null && session.isOpened()) {
	        // if the session is already open,
	        // try to show the selection fragment
	        showFragment(SELECTION, false);
	    } else {
	        // otherwise present the splash screen
	        // and ask the person to login.
	        showFragment(SPLASH, false);
	    }
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.psLogin) {
			savedPrefs
				.edit()
				.putString("psuname", psU.getText().toString())
				.putString("pspass", psP.getText().toString())
				.apply();
			
			psapi.login(psU.getText().toString(), psP.getText().toString());
		}
	}
}