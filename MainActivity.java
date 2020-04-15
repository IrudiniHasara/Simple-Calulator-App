package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button tow;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button eql;
    private Button clear;
    private TextView Numbers;
    private TextView Answer;
    private final char Addition = '+';
    private final char Subtract = '-';
    private final char Multyple = '*';
    private final char Division = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char Action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"1");
            }
        });
        tow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers.setText(Numbers.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Addition;
                Answer.setText(String.valueOf(val1)+"+");
                Numbers.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Subtract;
                Answer.setText(String.valueOf(val1)+"-");
                Numbers.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Multyple;
                Answer.setText(String.valueOf(val1)+"*");
                Numbers.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Division;
                Answer.setText(String.valueOf(val1)+"/");
                Numbers.setText(null);
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=EQU;
                Answer.setText(Answer.getText().toString()+ String.valueOf(val2) + "=" + String.valueOf(val1) );
                Numbers.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Numbers.getText().length()>0)
                {
                    CharSequence name = Numbers.getText().toString();
                    Numbers.setText(name.subSequence(0, name.length()-1));

                }
                else
                {
                    val1= Double.NaN;
                    val2=Double.NaN;
                    Numbers.setText(null);
                    Answer.setText(null);
                }
            }
        });
    }
    private void setupUIView()
    {
        one=(Button)findViewById(R.id.btn1);
        tow=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        zero=(Button)findViewById(R.id.btn0);
        add=(Button)findViewById(R.id.btnAdd);
        sub=(Button)findViewById(R.id.btnSub);
        mul=(Button)findViewById(R.id.btnMultiply);
        div=(Button)findViewById(R.id.btnDevide);
        eql=(Button)findViewById(R.id.btnEqual);
        clear=(Button)findViewById(R.id.btnClear);
        Numbers=(TextView)findViewById(R.id.txtNum);
        Answer=(TextView)findViewById(R.id.txtAnswer);

    }
    private void compute(){
        if (!Double.isNaN(val1))
        {
            val2=Double.parseDouble(Numbers.getText().toString());
            switch(Action)
            {
                case Addition:
                    val1 = val1+val2;
                    break;
                case Subtract:
                    val1 = val1-val2;
                    break;
                case Multyple:
                    val1 = val1*val2;
                    break;
                case Division:
                    val1 = val1/val2;
                    break;
                case EQU:
                    break;
            }
        }
        else
        {
            val1=Double.parseDouble(Numbers.getText().toString());
        }
    }
}
