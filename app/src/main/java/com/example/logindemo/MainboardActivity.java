package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainboardActivity extends AppCompatActivity {

    Button btnMileKm, btnCF, btnFootMetre, btnPoundKg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainboard);

        btnMileKm = findViewById(R.id.btnMileKm);
        btnMileKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainboardActivity.this, SubConversionActivity.class);
                intent.putExtra("option", 1);
                startActivity(intent);
            }
        });

        btnCF = findViewById(R.id.btnCF);
        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainboardActivity.this, SubConversionActivity.class);
                intent.putExtra("option", 2);
                startActivity(intent);
            }
        });

        btnFootMetre = findViewById(R.id.btnFootMetre);
        btnFootMetre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainboardActivity.this, SubConversionActivity.class);
                intent.putExtra("option", 3);
                startActivity(intent);
            }
        });

        btnPoundKg = findViewById(R.id.btnPoundKg);
        btnPoundKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainboardActivity.this, SubConversionActivity.class);
                intent.putExtra("option", 4);
                startActivity(intent);
            }
        });
    }
}
