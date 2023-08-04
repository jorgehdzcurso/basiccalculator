package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String displayText="";
    TextView tv_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_display = findViewById(R.id.tv_display);
        tv_display.setText("");
    }

    public void onClick(View view) {

        int id = view.getId();
        if (id == R.id.button0){
            displayText +="0";
        }
        else if (id == R.id.button1) {
            displayText +="1";
        }
        else if (id == R.id.button2) {
            displayText +="2";
        }
        else if (id == R.id.button3) {
            displayText +="3";
        }
        else if (id == R.id.button4) {
            displayText +="4";
        }
        else if (id == R.id.button5) {
            displayText +="5";
        }
        else if (id == R.id.button6) {
            displayText +="6";
        }
        else if (id == R.id.button7) {
            displayText +="7";
        }
        else if (id == R.id.button8) {
            displayText +="8";
        }
        else if (id == R.id.button9) {
            displayText +="9";
        }
        else if (id == R.id.buttonAdd) {
            displayText +="+";
        }
        else if (id == R.id.buttonSub) {
            displayText +="-";
        }
        else if (id == R.id.buttonMul) {
            displayText +="x";
        }
        else if (id == R.id.buttonDiv) {
            displayText +="/";
        }
        else if (id == R.id.buttonAc) {
            displayText ="";
        }
        else if (id == R.id.buttonBack) {
            int lenght = displayText.length();
            if (lenght>0) {
                displayText = displayText.substring(0, lenght-1);
            }
        }
        else if (id == R.id.buttonCalc) {

        }

        tv_display.setText(displayText);

    }
}