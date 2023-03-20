package com.example.laskinsovellus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ensiluku, toineluku;
    Button pluslasku, miinuslasku, kertolasku, jakolasku;
    Double num1,num2;
    TextView vstulos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ensiluku=findViewById(R.id.ensiluku);
        toineluku=findViewById(R.id.toineluku);
        pluslasku=findViewById(R.id.pluslasku);
        miinuslasku=findViewById(R.id.miinuslasku);
        kertolasku=findViewById(R.id.kertolasku);
        jakolasku=findViewById(R.id.jakolasku);
        vstulos=findViewById(R.id.vstulos);
        ClickListener();
    }
    public void ClickListener(){
        pluslasku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                num1=Double.parseDouble(ensiluku.getText().toString());
                num2=Double.parseDouble(toineluku.getText().toString());
                Double tulos=num1+num2;
                vstulos.setText(String.valueOf(tulos));
            }
        });
        miinuslasku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                num1 = Double.parseDouble(ensiluku.getText().toString());
                num2 = Double.parseDouble(toineluku.getText().toString());
                Double tulos = num1 - num2;
                vstulos.setText(String.valueOf(tulos));
            }
        });
        kertolasku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                num1 = Double.parseDouble(ensiluku.getText().toString());
                num2 = Double.parseDouble(toineluku.getText().toString());
                Double tulos = num1 * num2;
                vstulos.setText(String.valueOf(tulos));
            }
        });
        jakolasku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                num1 = Double.parseDouble(ensiluku.getText().toString());
                num2 = Double.parseDouble(toineluku.getText().toString());
                Double tulos = num1 / num2;
                vstulos.setText(String.valueOf(tulos));
            }
        });
    }
}