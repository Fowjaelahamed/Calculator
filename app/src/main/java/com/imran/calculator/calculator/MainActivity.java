package com.imran.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    /**********decleare variable**************/
    Button btnclear;
    TextView tvresult,tvprocessor;
    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnzero;
    String exp;
    Button btnplus,btnminus,btndivide,btnmul,btnequal,btndot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**********assigning varivable************/
        btnclear=findViewById(R.id.clear);
        tvprocessor=findViewById(R.id.expresion);
        tvresult=findViewById(R.id.showresult);

        /******setting result and expression null for begining***************/
        tvprocessor.setText("");
        tvresult.setText("");

        btnone=findViewById(R.id.one);
        btntwo=findViewById(R.id.two);
        btnthree=findViewById(R.id.three);
        btnfour=findViewById(R.id.four);
        btnfive=findViewById(R.id.five);
        btnsix=findViewById(R.id.six);
        btnseven=findViewById(R.id.seven);
        btneight=findViewById(R.id.eight);
        btnnine=findViewById(R.id.nine);
        btnzero=findViewById(R.id.zero);

        btnplus=findViewById(R.id.plus);
        btnminus=findViewById(R.id.minus);
        btndivide=findViewById(R.id.divide);
        btnmul=findViewById(R.id.mul);
        btnequal=findViewById(R.id.equal);
        btndot=findViewById(R.id.dot);

        /*******using listener for number button***************/
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprocessor.setText("");
                tvresult.setText("");
            }
        });

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"1");
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"2");
            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"3");
            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"4");
            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"5");
            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"6");
            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"7");
            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"8");
            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"9");
            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText( exp+".");
            }
        });


        /********using listener for functional button************/
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"+");
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"-");
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"÷");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                tvprocessor.setText(exp+"x");
            }
        });
        /*********eual button ****************/
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=tvprocessor.getText().toString();
                exp=exp.replaceAll("x","*");
                exp=exp.replaceAll("÷","/");
                try{
                    Expression e= new ExpressionBuilder(exp).build();
                    tvresult.setText(""+e.evaluate());
                    exp=""+e.evaluate();
                    tvprocessor.setText(exp);
                }catch(Exception e){
                    Log.d("Exception","message : "+e.getMessage());
                }

            }
        });

    }
}
