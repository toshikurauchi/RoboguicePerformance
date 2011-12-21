package br.com.caelum.roboguice.test;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.inject.Inject;

@ContentView(R.layout.main)
public class InjectionTest extends RoboActivity {
	@Inject CustomDependency1 customDependency1;
	@Inject CustomDependency2 customDependency2;
	@Inject CustomDependency3 customDependency3;
	@Inject CustomDependency4 customDependency4;
	@Inject CustomDependency5 customDependency5;
	@InjectView(R.id.custom_view) TextView textView;
	
	private Long start;
	
	public InjectionTest() {
		start = System.currentTimeMillis();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		long time = System.currentTimeMillis() - start;
		Log.i("ROBOGUICE", "" + time);
		textView.setText(""+time);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("ROBOGUICE", "Being destroyed");
	}
}
