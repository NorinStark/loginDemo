package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MeterFeetActivity extends AppCompatActivity {

    private Button m2ft_Btn;
    private Button ft2m_Btn;
    private EditText input_Edt;
    private TextView output_Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_feet);

        m2ft_Btn = findViewById(R.id.kg2lbs_btn);
        ft2m_Btn = findViewById(R.id.lbs2kg_btn);
        input_Edt = findViewById(R.id.input_edt);
        output_Tv = findViewById(R.id.output_tv);

        userInput();

    }

    private void userInput(){
        m2ft_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double meter = Double.parseDouble(input_Edt.getText().toString());
                double feet = converterClass.m2ft_fn(meter);
                output_Tv.setText(Double.toString(feet));
            }
        });

        ft2m_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double feet = Double.parseDouble(input_Edt.getText().toString());
                double meter = converterClass.ft2m_fn(feet);
                output_Tv.setText(Double.toString(meter));
            }
        });
    }

    public class ConverterClass{
        public double m2ft_fn(double meter){
            return meter*3.281;
        }
        public double ft2m_fn(double feet){
            return feet/3.281;
        }
    }
}
