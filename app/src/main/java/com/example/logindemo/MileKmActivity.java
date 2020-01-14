package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MileKmActivity extends AppCompatActivity {

    private Button mile2km_Btn;
    private Button km2mile_Btn;
    private EditText input_Edt;
    private TextView output_Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mile_km);

        mile2km_Btn = findViewById(R.id.kg2lbs_btn);
        km2mile_Btn = findViewById(R.id.lbs2kg_btn);
        input_Edt = findViewById(R.id.input_edt);
        output_Tv = findViewById(R.id.output_tv);

        userInput();
    }

    private void userInput(){
        mile2km_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double mile = Double.parseDouble(input_Edt.getText().toString());
                double km = converterClass.mile2km_fn(mile);
                output_Tv.setText(Double.toString(km));
            }
        });

        km2mile_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double km = Double.parseDouble(input_Edt.getText().toString());
                double mile = converterClass.km2mile_fn(km);
                output_Tv.setText(Double.toString(mile));
            }
        });
    }

    public class ConverterClass {
        public double mile2km_fn(double mile)
        {
            return mile*1.60934;
        }

        public double km2mile_fn(double km)
        {
            return km/1.60934;
        }
    }
}
