package com.example.currencyconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnn, btnn1;
    EditText edit;
    TextView txt;
    TextView txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnn = (Button) findViewById(R.id.btn);
        btnn1 = (Button) findViewById(R.id.btn1);
        edit = (EditText) findViewById(R.id.edittext);
        txt = (TextView) findViewById(R.id.textview);
        txt2 = (TextView) findViewById(R.id.textview2);


        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double DollarValue = Double.parseDouble(edit.getText().toString());
                calculateDollars(DollarValue);
                txt2.setText("" + calculateDollars(DollarValue));
            }
        });

        btnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double EuroValue = Double.parseDouble(edit.getText().toString());
                calculateEuro(EuroValue);
                txt2.setText("" + calculateEuro(EuroValue));
            }
        });


    }

    public double calculateDollars(double value) {
        double dollars = value * 0.0036;
        return dollars;
    }

    public double calculateEuro(double value) {
        double Euro = value * 0.0033;
        return Euro;
    }
}
