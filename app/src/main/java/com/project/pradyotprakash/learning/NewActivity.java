package com.project.pradyotprakash.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView newTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        newTextView = findViewById(R.id.newTextView);
        // use the class static variable and set it to the text view
        newTextView.setText(Constants.str);
    }
}
