package com.example.treentreat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private ImageView mImage;
	private int step;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		step = 0;
		
		mImage = (ImageView) findViewById(R.id.myimage);
		mImage.setOnClickListener(new OnClickListener() {
			@Override
            public void onClick(View arg0) {
				step++;
				
				switch (step) {
    			case 1:
    				mImage.setImageResource(R.drawable.a1);
    				break;
		    	case 2:
		    		mImage.setImageResource(R.drawable.a2);
		    		break;
		    	case 3:
		    		mImage.setImageResource(R.drawable.a3);
		    		break;
		    	case 4:
		    		mImage.setImageResource(R.drawable.a4);
		    		break;
		    	case 5:
		    		mImage.setImageResource(R.drawable.a5);
		    		break;
		    	case 6:
		    		mImage.setImageResource(R.drawable.a6);
		    		break;
		    	case 7:
		    		mImage.setImageResource(R.drawable.a7);
		    		break;
		    	case 8:
		    		mImage.setImageResource(R.drawable.a8);
		    		break;
		    	default:
					break;
    			}
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
