package com.example.kgadde.activitylifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int createCount, startCount, resumeCount, pauseCount, stopCount, restartCount, destroyCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCount++;
        TextView t = (TextView) findViewById(R.id.t1);
        t.setText("onCreate(): " + createCount);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    protected void onStart()
    {
        super.onStart();
        startCount++;
        TextView t = (TextView) findViewById(R.id.t2);
        t.setText("onStart(): " + startCount);
    }
    protected void onResume()
    {
        super.onResume();
        resumeCount++;
        TextView t = (TextView) findViewById(R.id.t3);
        t.setText("onResume(): " + resumeCount);
    }
    protected void onPause()
    {
        super.onPause();
        pauseCount++;
        TextView t = (TextView) findViewById(R.id.t4);
        t.setText("onPause(): " + pauseCount);
    }
    protected void onStop()
    {
        super.onStop();
        stopCount++;
        TextView t = (TextView) findViewById(R.id.t5);
        t.setText("onCreate() : " + stopCount);
    }
    protected void onRestart()
    {
        super.onRestart();
        restartCount++;
        TextView t = (TextView) findViewById(R.id.t6);
        t.setText("onRestart(): " + restartCount);
    }
    protected void onDestroy()
    {
        super.onDestroy();
        destroyCount++;
        TextView t = (TextView) findViewById(R.id.t7);
        t.setText("onDestroy(): " + destroyCount);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
