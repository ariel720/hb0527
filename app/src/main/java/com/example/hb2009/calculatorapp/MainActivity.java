package com.example.hb2009.calculatorapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 /*램영역*/
    EditText num1,num2;
    Button plus,min,multi,divi,equal;
    TextView result;
    NumberBean bean;
    CalcService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*메소드 내부는 CPU영역으로 연산을 함*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bean = new NumberBean();
        service = new CalcServiceImpl(); //인터페이스를 상속받는애는 형태를인터페이스로 두고 newimpl을 한다.

        num1= (EditText) findViewById(R.id.num1);
        num2= (EditText) findViewById(R.id.num2);

        plus = (Button) findViewById(R.id.plus);
        min = (Button) findViewById(R.id.min);
        multi = (Button) findViewById(R.id.multi);
        divi = (Button) findViewById(R.id.divi);
        equal = (Button) findViewById(R.id.equal);

        result = (TextView) findViewById(R.id.result);

        plus.setOnClickListener(this);
        min.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        /*int <-> string <-> text 차례로 형변환이이루어짐*/

        bean.setFirstNum(Integer.parseInt(num1.getText().toString()));
        bean.setSecondNum(Integer.parseInt(num2.getText().toString()));
        //변수를 임의로 만들지않고 bean에 담아 값에 대한 보안을 강화 : encapsulation(은닉화)
        //알고리즘의 보안 : 추상화

        switch (v.getId()){
            case R.id.plus:
                bean.setResultNum(service.plus(bean));
                break;

            case R.id.min:
                bean.setResultNum(service.min(bean));
                break;

            case R.id.multi:
                bean.setResultNum( service.multi(bean));
                break;

            case R.id.divi:
                bean.setResultNum( service.divi(bean));
                break;

            case R.id.equal:
                result.setText(String.valueOf(bean.getResultNum()));
                break;
        }

        Log.d("넘어온 숫자",String.valueOf(bean.getResultNum())); //안드로이드 모니터 디버깅
        Toast.makeText(MainActivity.this, String.valueOf(bean.getResultNum()), Toast.LENGTH_SHORT).show();
    }
}
