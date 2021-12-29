package com.example.lecture2app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attempt to lauch activity within our own app
        Button secondActivityBtn =(Button)findViewById(R.id.secondActivity);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.example.lecture2app.NIBS", "Hello World!");
                startActivity(startIntent);
            }
        });

        //Attempt to lauch activity outside our app
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http:/www.google.fi";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoole = new Intent(Intent.ACTION_VIEW, webaddress);
                    startActivity(gotoGoole);
            }
        });

    }
}