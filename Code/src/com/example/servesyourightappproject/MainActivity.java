package com.example.servesyourightappproject;


//import android.R;
import android.R.layout;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        TabHost th = (TabHost) findViewById(R.id.tabhost);
        th.setup();
       getWindow().setBackgroundDrawableResource(R.drawable.red);
       // Button button1 = (Button) findViewById(R.id.button1);
       // button1.setOnClickListener(this);
        Resources res = getResources();
        
        //
        TabSpec specs = th.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("About"); //tabname
        th.addTab(specs);
       //
        TabSpec specs1 = th.newTabSpec("tag2");
        specs1.setContent(R.id.tab2);
        specs1.setIndicator("Services"); //tabname
        th.addTab(specs1);
       //
        TabSpec specs11 = th.newTabSpec("tag3");
        specs11.setContent(R.id.tab3);
        specs11.setIndicator("Contact"); //tabname
        th.addTab(specs11);
       //
    
        
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
