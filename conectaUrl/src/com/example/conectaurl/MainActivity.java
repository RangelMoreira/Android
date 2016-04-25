package com.example.conectaurl;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button b1;

	  //pegar valor site
  public String pegarSite(){
    	EditText val;
    	val=(EditText) findViewById(R.id.editText1);
    	return val.getText().toString();
    } 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		
		
		
		b1 = (Button) findViewById(R.id.button1);
	        b1.setOnClickListener(new OnClickListener()
	        {
	            public void onClick(View arg0){
	            	String url =pegarSite(); 
	            	
	            	Intent i = new Intent("android.intent.action.VIEW");            	
	            	i.setData(Uri.parse(url));            	
	                startActivity(i);                
	            }
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
