package com.osaiteh.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven,
            eight, nine, zero, plus, minus, cButton,
            divide, multiply, equalsTo, backSpace, decimalPoint;
    EditText inputNumber;
    TextView seeResult;
    float mNumberOne, mNumberTwo;
    boolean plus_m, minus_m, divide_m, multiply_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        cButton = findViewById(R.id.cButton);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        equalsTo = findViewById(R.id.equalsTo);
        backSpace = findViewById(R.id.backspace);
        decimalPoint = findViewById(R.id.decimalPoint);
        inputNumber = findViewById(R.id.inputNumber);
        seeResult = findViewById(R.id.seeResult);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"4");
            }
        });
       five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+"9");
            }
        });
        decimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText()+".");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputNumber == null) {
                    inputNumber.setText("");
                } else {
                    mNumberOne = Float.parseFloat(inputNumber.getText() + "");
                    plus_m = true;
                    inputNumber.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumberOne = Float.parseFloat(inputNumber.getText() + "");
                minus_m = true;
                inputNumber.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumberOne = Float.parseFloat(inputNumber.getText() + "");
                divide_m = true;
                inputNumber.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             mNumberOne = Float.parseFloat(inputNumber.getText() + "");
             multiply_m = true;
             inputNumber.setText(null);
            }
        });

        equalsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumberTwo = Float.parseFloat(inputNumber.getText() + "");

                if (plus_m == true) {
                    seeResult.setText(mNumberOne + mNumberTwo + "");
                    plus_m = false;
                }

                if (minus_m== true) {
                   seeResult.setText(mNumberOne - mNumberTwo + "");
                   minus_m = false;
                }

                if (multiply_m == true) {
                    seeResult.setText(mNumberOne * mNumberTwo + "");
                    multiply_m = false;
                }

                if (divide_m == true) {
                    seeResult.setText(mNumberOne / mNumberTwo + "");
                    divide_m = false;
                }
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText("");
            }
        });

        decimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumber.setText(inputNumber.getText() + ".");
            }
        });


    };

}
