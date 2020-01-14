package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KgPoundActivity extends AppCompatActivity {

    private Button kg2lbs_Btn;
    private Button lbs2kg_Btn;
    private EditText input_Edt;
    private TextView output_Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_pound);

        kg2lbs_Btn = findViewById(R.id.kg2lbs_btn);
        lbs2kg_Btn = findViewById(R.id.lbs2kg_btn);
        input_Edt = findViewById(R.id.input_edt);
        output_Tv = findViewById(R.id.output_tv);

        userInput();
    }

    private void userInput(){
        kg2lbs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double kg = Double.parseDouble(input_Edt.getText().toString());
                double lbs = converterClass.kg2lbs_fn(kg);
                output_Tv.setText(Double.toString(lbs));
            }
        });

        lbs2kg_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterClass converterClass = new ConverterClass();
                double lbs = Double.parseDouble(input_Edt.getText().toString());
                double kg = converterClass.lbs2kg_fn(lbs);
                output_Tv.setText(Double.toString(kg));
            }
        });
    }

    public class ConverterClass {
        public double kg2lbs_fn(double kg){
            return kg*2.205;
        }
        public double lbs2kg_fn(double lbs){
            return lbs/2.205;
        }
    }
}
