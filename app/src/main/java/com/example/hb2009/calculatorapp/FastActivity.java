package com.example.hb2009.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FastActivity extends AppCompatActivity {
/*메모리와 CPU를 왔다갔다하지말자.
            변수선언여기다 하지않아.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast);

        final EditText num1 = (EditText) findViewById(R.id.num1);
        final EditText num2 = (EditText) findViewById(R.id.num2);

        final TextView result = (TextView) findViewById(R.id.result);
        final NumberBean bean = new NumberBean();
        final CalcService service = new CalcServiceImpl();

       findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
               bean.setSecondNum(Integer.parseInt(num2.getText().toString()));
               bean.setResultNum(service.plus(bean));
           }
       });

        findViewById(R.id.min).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));
                bean.setResultNum(service.min(bean));
            }
        });

        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));
                bean.setResultNum(service.multi(bean));
            }
        });

        findViewById(R.id.divi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));
                bean.setResultNum(service.divi(bean));
            }
        });

        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(bean.getResultNum()));
            }
        });
    }
}
