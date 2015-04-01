package com.nishantd.samples.sampleprovider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class StarterActivity extends Activity {

    private static final String TAG = StarterActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "The activity is created:");
        setContentView(R.layout.activity_starter);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "The activity is started");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "The activity is resumed");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "The activity is restarted");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "The activity is stopped");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "The activity is paused");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "The activity is destroyed");
    }

    public void startConfigurationActivity(View view) {
        Intent intent = new Intent(this, ConfigureActivity.class);
        startActivity(intent);
    }
}
