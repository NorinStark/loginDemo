package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class conversionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        final Button MileToKm;
        final Button CelciusToFahrenheit;
        final Button MeterToFeet;
        final Button KgToPound;

        MileToKm = (Button)findViewById(R.id.btnMileKm);
        MileToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(conversionActivity.this, MileKmActivity.class);
                startActivity(intent);
            }
        });

        CelciusToFahrenheit = (Button)findViewById(R.id.btnCF);
        CelciusToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(conversionActivity.this,CelciusFahrenheitActivity.class);
                startActivity(intent);
            }
        });

        MeterToFeet = (Button)findViewById(R.id.btnMFt);
        MeterToFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(conversionActivity.this, MeterFeetActivity.class);
                startActivity(intent);
            }
        });

        KgToPound = (Button)findViewById(R.id.btnKgPound);
        KgToPound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(conversionActivity.this, KgPoundActivity.class);
                startActivity(intent);
            }
        });
    }
}
