package br.com.caelum.roboguice.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RoboguicePerformanceActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Intent intent = new Intent(this, InjectionTest.class);
		intent.putExtra("start", System.currentTimeMillis());
		startActivity(intent);
	}
}