package com.example.hb2009.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();
    }

    public void initview(){

        final NumberBean bean = new NumberBean();
        final CalcService service = new CalcServiceImpl();
        final TextView result = (TextView) findViewById(R.id.tv_result);

        findViewById(R.id.btn_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.et_num1);
                EditText num2 = (EditText) findViewById(R.id.et_num2);

                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));

                result.setText(String.valueOf(service.plus(bean)));
            }
        });

        findViewById(R.id.btn_divi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.et_num1);
                EditText num2 = (EditText) findViewById(R.id.et_num2);

                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));

                result.setText(String.valueOf(service.divi(bean)));
            }
        });

        findViewById(R.id.btn_min).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.et_num1);
                EditText num2 = (EditText) findViewById(R.id.et_num2);

                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));

                result.setText(String.valueOf(service.min(bean)));

            }
        });

       findViewById(R.id.btn_multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.et_num1);
                EditText num2 = (EditText) findViewById(R.id.et_num2);

                bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
                bean.setSecondNum(Integer.parseInt(num2.getText().toString()));

                result.setText(String.valueOf(service.multi(bean)));
            }
        });




    }


}
