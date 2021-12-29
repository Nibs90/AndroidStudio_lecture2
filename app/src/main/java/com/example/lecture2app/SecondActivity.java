package com.example.lecture2app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.lecture2app.NIBS")){
            TextView tv =(TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.lecture2app.NIBS");
            tv.setText(text);
        }
    }
}