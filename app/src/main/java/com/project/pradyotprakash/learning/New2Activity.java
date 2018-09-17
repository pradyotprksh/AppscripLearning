package com.project.pradyotprakash.learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class New2Activity extends AppCompatActivity implements MyInterface {

    private Button new2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        new2Button = findViewById(R.id.new2Button);
        new2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton();
            }
        });
    }

    @Override
    public void onClickButton() {
        Toast.makeText(New2Activity.this, "Button Was Clicked. And toast is shown using interface", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(New2Activity.this, NewClass.class);
        startActivity(intent);
    }
}
