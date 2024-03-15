package com.example.learning6;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView output;
    Button btnConvert1;
    Button btnConvert2;
    Button btnConvert3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.num1EditText);
        output=findViewById(R.id.resultTextView);
        btnConvert1=findViewById(R.id.Button1);
        btnConvert2=findViewById(R.id.Button2);
        btnConvert3=findViewById(R.id.Button3);

        btnConvert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inr;
                float dol;
                dol=Float.parseFloat(input.getText().toString());
                inr= dol*82.85f;
                output.setText(String.valueOf(inr));
            }
        });
        btnConvert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float euro;
                float dol;
                dol=Float.parseFloat(input.getText().toString());
                euro= dol*0.92f;
                output.setText(String.valueOf(euro));
            }
        });
        btnConvert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float yen;
                float dol;
                dol=Float.parseFloat(input.getText().toString());
                yen= dol*149.34f;
                output.setText(String.valueOf(yen));
            }
        });
    }
}
