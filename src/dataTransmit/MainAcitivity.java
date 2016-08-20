package dataTransmit;

import com.example.datatransmit.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainAcitivity extends Activity{
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		btn=(Button) findViewById(R.id.btn_main);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainAcitivity.this,OtherActivity.class);
				Obj obj = new Obj();
				obj.setName("¶º±È");
				Obj2 obj2 = new Obj2();
				obj2.setName("ºï×Ó");
				intent.putExtra("data", obj);
				intent.putExtra("data2", obj2);
				startActivity(intent);
			}
		});
	}

}
