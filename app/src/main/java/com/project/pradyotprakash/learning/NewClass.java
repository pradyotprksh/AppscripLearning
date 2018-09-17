package com.project.pradyotprakash.learning;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class NewClass extends Activity{

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(NewClass.this, "New Java Class Which Extends Activity", Toast.LENGTH_SHORT).show();
        Log.v(TAG, "OnCreate() method of NewClass is called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "OnStart() method of NewClass is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "OnResume() method of NewClass is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "OnPause() method of NewClass is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "OnStop() method of NewClass is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "OnDestroy() method of NewClass is called");
    }

}
