package com.example.kgadde.activitylifecycle;

import android.content.SharedPreferences;
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

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getPreferences(MODE_PRIVATE);
        editor = sharedPreferences.edit();

        int createCount = sharedPreferences.getInt("createcount", 0);
        createCount++;
        TextView t = (TextView) findViewById(R.id.t1);
        t.setText("onCreate(): " + createCount);
        editor.putInt("createcount", createCount);
        editor.commit();

        int pauseCount = sharedPreferences.getInt("pausecount", 0);
        TextView t2 = (TextView) findViewById(R.id.t4);
        t2.setText("onResume(): " + pauseCount);

        int stopCount = sharedPreferences.getInt("stopcount", 0);
        TextView t3 = (TextView) findViewById(R.id.t5);
        t3.setText("onStop() : " + stopCount);

        int restartCount = sharedPreferences.getInt("restartcount", 0);
        TextView t4 = (TextView) findViewById(R.id.t6);
        t4.setText("onRestart(): " + restartCount);

        int destroyCount = sharedPreferences.getInt("destroycount", 0);
        TextView t5 = (TextView) findViewById(R.id.t7);
        t5.setText("onDestroy(): " + destroyCount);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        int startCount = sharedPreferences.getInt("startcount", 0);
        startCount++;
        TextView t = (TextView) findViewById(R.id.t2);
        t.setText("onStart(): " + startCount);
        editor.putInt("startcount", startCount);
        editor.commit();
    }
    protected void onResume()
    {
        super.onResume();
        int resumeCount = sharedPreferences.getInt("resumecount", 0);
        resumeCount++;
        TextView t = (TextView) findViewById(R.id.t3);
        t.setText("onResume(): " + resumeCount);
        editor.putInt("resumecount", resumeCount);
        editor.commit();
    }
    protected void onPause()
    {
        super.onPause();
        int pauseCount = sharedPreferences.getInt("pausecount", 0);
        pauseCount++;
        TextView t = (TextView) findViewById(R.id.t4);
        t.setText("onResume(): " + pauseCount);
        editor.putInt("pausecount", pauseCount);
        editor.commit();
    }
    protected void onStop()
    {
        super.onStop();
        int stopCount = sharedPreferences.getInt("stopcount", 0);
        stopCount++;
        TextView t = (TextView) findViewById(R.id.t5);
        t.setText("onStop() : " + stopCount);
        editor.putInt("stopcount", stopCount);
        editor.commit();
    }
    protected void onRestart()
    {
        super.onRestart();
        int restartCount = sharedPreferences.getInt("restartcount", 0);
        restartCount++;
        TextView t = (TextView) findViewById(R.id.t6);
        t.setText("onRestart(): " + restartCount);
        editor.putInt("restartcount", restartCount);
        editor.commit();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        int destroyCount = sharedPreferences.getInt("destroycount", 0);
        destroyCount++;
        TextView t = (TextView) findViewById(R.id.t7);
        t.setText("onDestroy(): " + destroyCount);
        editor.putInt("destroycount", destroyCount);
        editor.commit();
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
