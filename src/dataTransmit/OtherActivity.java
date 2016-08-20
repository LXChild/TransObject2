package dataTransmit;

import com.example.datatransmit.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OtherActivity extends Activity{
	private TextView TV_01;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle bundle=getIntent().getExtras();
		Obj data= (Obj) bundle.get("data");
		Obj2 data2= (Obj2) bundle.get("data2");
		setContentView(R.layout.layout_01);
		TV_01=(TextView) findViewById(R.id.TV_01);
		Log.d("OtherActivity", data.getName());
		Log.d("OtherActivity", data2.getName());
		TV_01.setText(data.getName()+data2.getName());
		}
}
