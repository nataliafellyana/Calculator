package com.example.nataliascalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonMin, buttonDiv,
            buttonMul, buttondot, buttondel, buttonEqual;

    EditText tempEditText;

    float val1,val2;

    boolean tempAddition, tempSubtract, tempMultiplication, tempDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttondot = (Button) findViewById(R.id.button_dot);
        buttonAdd = (Button) findViewById(R.id.button_plus);
        buttonMin = (Button) findViewById(R.id.button_min);
        buttonMul = (Button) findViewById(R.id.button_kali);
        buttonDiv = (Button) findViewById(R.id.button_div);
        buttondel = (Button) findViewById(R.id.button_del);
        buttonEqual = (Button) findViewById(R.id.button_eq);
        tempEditText = (EditText) findViewById(R.id.et_edit);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tempEditText==null)
                {
                    tempEditText.setText("");
                }
                else
                {
                    val1=Float.parseFloat(tempEditText.getText()+"");
                    tempAddition=true;
                    tempEditText.setText(null);
                }
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(tempEditText.getText()+"");
                tempSubtract=true;
                tempEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(tempEditText.getText()+"");
                tempMultiplication=true;
                tempEditText.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(tempEditText.getText()+"");
                tempDivision=true;
                tempEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(tempEditText.getText()+"");
                if(tempAddition==true)
                {
                    tempEditText.setText(val1+val2+"");
                    tempAddition=false;
                }
                if(tempSubtract==true)
                {
                    tempEditText.setText(val1-val2+"");
                    tempSubtract=false;
                }
                if(tempMultiplication==true)
                {
                    tempEditText.setText(val1*val2+"");
                    tempMultiplication=false;
                }
                if(tempDivision==true)
                {
                    tempEditText.setText(val1/val2+"");
                    tempDivision=false;
                }
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText(tempEditText.getText()+".");
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempEditText.setText("");
            }
        });
    }
}
