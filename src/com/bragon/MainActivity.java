package com.bragon;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private ArrayList<String> grades = new ArrayList<String>();
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startActivity(new Intent(this, LoginActivity.class));
	
		/// Test ListView
		grades.add("APCS Lab: A");
		grades.add("History Essay: F-");
		grades.add("Math Test: A-");
		grades.add("Chemistry Project: B");
		
		ListView listView = (ListView) findViewById(R.id.listView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, android.R.id.text1, grades);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			/// Do the Facebook connect stuff here
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				new AlertDialog.Builder(MainActivity.this)
					.setMessage("Are you sure you want to post this on facebook?")
					.setTitle("Are you sure?")
					.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							Toast.makeText(MainActivity.this, "posting on facebook", Toast.LENGTH_SHORT).show();
						}
					}).setNegativeButton("No", null).show();
			}
		});
	}
}
