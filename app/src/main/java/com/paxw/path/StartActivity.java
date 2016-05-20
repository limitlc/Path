package com.paxw.path;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

import com.paxw.path.utils.AdUtils;

public class StartActivity extends BaseActivity {

	ImageButton normal, hard, insane;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		normal = (ImageButton)findViewById(R.id.Normal);
		normal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), GameActivity.class);
				intent1.putExtra("activity", 5);
				startActivityForResult(intent1,1);
			}
		});
		hard = (ImageButton)findViewById(R.id.Hard);
		hard.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), GameActivity.class);
				intent1.putExtra("activity", 6);
				startActivityForResult(intent1,2);
			}
		});
		insane = (ImageButton)findViewById(R.id.Insane);
		insane.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), GameActivity.class);
				intent1.putExtra("activity", 8);
				startActivityForResult(intent1,3);	
			}
		});
		AdUtils.setAD(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}
