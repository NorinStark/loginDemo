package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        final Button viewCalendar;
        final Button viewMap;
        final Button viewWeb;

        viewCalendar = (Button)findViewById(R.id.btnMileKm);
        viewCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, SubActivity1.class);
                startActivity(intent);
            }
        });

        viewMap = (Button)findViewById(R.id.btnCF);
        viewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        viewWeb = (Button)findViewById(R.id.btnMFt);
        viewWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, SubActivity2.class);
                startActivity(intent);
            }
        });
    }
}
