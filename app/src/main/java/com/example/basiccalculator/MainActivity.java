package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String display = "";
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
            display +="0";
        }
        else if (id == R.id.button1) {
            display +="1";
        }
        else if (id == R.id.button2) {
            display +="2";
        }
        else if (id == R.id.button3) {
            display +="3";
        }
        else if (id == R.id.button4) {
            display +="4";
        }
        else if (id == R.id.button5) {
            display +="5";
        }
        else if (id == R.id.button6) {
            display +="6";
        }
        else if (id == R.id.button7) {
            display +="7";
        }
        else if (id == R.id.button8) {
            display +="8";
        }
        else if (id == R.id.button9) {
            display +="9";
        }
        else if (id == R.id.buttonAdd) {
            display +="+";
        }
        else if (id == R.id.buttonSub) {
            display +="-";
        }
        else if (id == R.id.buttonMul) {
            display +="x";
        }
        else if (id == R.id.buttonDiv) {
            display +="/";
        }
        else if (id == R.id.buttonAc) {
            display ="";
        }
        else if (id == R.id.buttonBack) {
            if (display.length()>0) {
                display = display.substring(0, display.length()-1);
            }
        }
        else if (id == R.id.buttonCalc) {

        }

        tv_display.setText(display);

    }
}