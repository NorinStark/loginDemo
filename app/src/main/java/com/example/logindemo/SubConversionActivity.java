package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubConversionActivity extends AppCompatActivity {

    EditText etFrom, etTo;
    Button btnFromTo, btnToFrom;
    TextView tvFrom, tvTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_conversion);

        etFrom = findViewById(R.id.etMile);
        etTo = findViewById(R.id.etKm);

        btnFromTo = findViewById(R.id.btnMileToKm);
        btnToFrom = findViewById(R.id.btnKmToMile);

        tvFrom = findViewById(R.id.tvFrom);
        tvTo = findViewById(R.id.tvTo);

        Bundle b = getIntent().getExtras();
        int opt = b.getInt("option");
        Log.d("===>", "" + opt);

        if(opt == 1){
            btnFromTo.setText("Mile to Km");
            btnToFrom.setText("Km to Mile");
            tvFrom.setText("Mile");
            tvTo.setText("Km");

            btnFromTo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fromString = "0" + etFrom.getText().toString();
                    double from = Double.parseDouble(fromString);
                    double to = from * 1.60934;
                    etTo.setText("" + to);
                }
            });

            btnToFrom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toString = "0" + etTo.getText().toString();
                    double to = Double.parseDouble(toString);
                    double from = to / 1.60934;
                    etFrom.setText("" + from);
                }
            });
        }

        if (opt == 2){
            btnFromTo.setText("C to F");
            btnToFrom.setText("F to C");
            tvFrom.setText("C");
            tvTo.setText("F");

            btnFromTo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fromString = "0" + etFrom.getText().toString();
                    double from = Double.parseDouble(fromString);
                    double to = (from * 9/5) + 32;
                    etTo.setText("" + to);
                }
            });

            btnToFrom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toString = "0" + etTo.getText().toString();
                    double to = Double.parseDouble(toString);
                    double from = (to - 32) * 5/9;
                    etFrom.setText("" + from);
                }
            });
        }

        if (opt == 3){
            btnFromTo.setText("Foot to Metre");
            btnToFrom.setText("Metre to Foot");
            tvFrom.setText("Foot");
            tvTo.setText("Metre");

            btnFromTo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fromString = "0" + etFrom.getText().toString();
                    double from = Double.parseDouble(fromString);
                    double to = from / 3.281;
                    etTo.setText("" + to);
                }
            });

            btnToFrom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toString = "0" + etTo.getText().toString();
                    double to = Double.parseDouble(toString);
                    double from = to * 3.281;
                    etFrom.setText("" + from);
                }
            });
        }

        if (opt == 4){
            btnFromTo.setText("Pound to Kg");
            btnToFrom.setText("Kg to Pound");
            tvFrom.setText("Pound");
            tvTo.setText("Kg");

            btnFromTo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fromString = "0" + etFrom.getText().toString();
                    double from = Double.parseDouble(fromString);
                    double to = from / 2.205;
                    etTo.setText("" + to);
                }
            });

            btnToFrom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String toString = "0" + etTo.getText().toString();
                    double to = Double.parseDouble(toString);
                    double from = to * 2.205;
                    etFrom.setText("" + from);
                }
            });
        }
    }
}
