package com.project.pradyotprakash.learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    private View view;
    private ImageView picassoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "OnCreate() method is called");
        view = findViewById(R.id.mainButton);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, New2Activity.class);
                startActivity(intent);
            }
        });
        view = findViewById(R.id.mainImage);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });
        picassoImageView = findViewById(R.id.picassoImageView);
        // used picasso to load image from url.
        Picasso.get().load("http://upload.wikimedia.org/wikipedia/commons/e/ee/Android_green_figure,_next_to_its_original_packaging.jpg").into(picassoImageView);
        picassoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Image shown using URL with the help of library Picasso.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "OnStart() method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "OnResume() method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "OnPause() method is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "OnStop() method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "OnDestroy() method is called");
    }

}
