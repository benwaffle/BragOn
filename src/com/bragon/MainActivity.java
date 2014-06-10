package com.bragon;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	private ArrayList<String> grades = new ArrayList<String>();
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startActivity(new Intent(this, LoginActivity.class));
	
		/// Test ListView
		grades.add("One");
		grades.add("Two");
		grades.add("Three");
		ListView listView = (ListView) findViewById(R.id.listView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, android.R.id.text1, grades);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			/// Do the Facebook connect stuff here
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
			}
		});
	}
}
