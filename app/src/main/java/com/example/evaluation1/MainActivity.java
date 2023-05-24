package com.example.evaluation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editTextNumberDecimalBase;
    EditText editTextNumberDecimalHeight;
    TextView textViewArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumberDecimalBase = findViewById(R.id.editTextNumberDecimalBase);
        editTextNumberDecimalHeight = findViewById(R.id.editTextNumberDecimalHeight);
        textViewArea = findViewById(R.id.textViewArea);

        findViewById(R.id.buttonReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumberDecimalBase.setText("");
                editTextNumberDecimalHeight.setText("");
                textViewArea.setText("");
            }

        });

        findViewById(R.id.buttonCalculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea(){
        String enteredAmount1 = editTextNumberDecimalBase.getText().toString();
        String enteredAmount2 = editTextNumberDecimalHeight.getText().toString();
        try{
            double amount1 = Double.valueOf(enteredAmount1);
            double amount2 = Double.valueOf(enteredAmount2);
            double areaFinal = (amount1 * amount2)/2;
            textViewArea.setText(String.valueOf(areaFinal));
        }catch (NumberFormatException exception){
            Toast.makeText(MainActivity.this, "Enter a valid number !!", Toast.LENGTH_LONG).show();
        }

    }

}