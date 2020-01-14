package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CelciusFahrenheitActivity extends AppCompatActivity {

    private Button c2f_Btn;
    private Button f2c_Btn;
    private EditText input_Edt;
    private TextView output_Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_fahrenheit);

        c2f_Btn = findViewById(R.id.lbs2kg_btn);
        f2c_Btn = findViewById(R.id.kg2lbs_btn);
        input_Edt = findViewById(R.id.input_edt);
        output_Tv = findViewById(R.id.output_tv);

        userInput();
    }

    private void userInput(){
        c2f_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double degCel = Double.parseDouble(input_Edt.getText().toString());
                double degFar = converterClass.c2f_fn(degCel);
                output_Tv.setText(Double.toString(degFar));
            }
        });

        f2c_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double degFar = Double.parseDouble(input_Edt.getText().toString());
                double degCel = converterClass.f2c_fn(degFar);
                output_Tv.setText(Double.toString(degCel));
            }
        });
    }

    public class ConverterClass {
        public double c2f_fn(double celsius)
        {
            return (celsius*1.8)+32;
        }

        public double f2c_fn(double farenheit)
        {
            return (farenheit-32)/1.8;
        }
    }

}
