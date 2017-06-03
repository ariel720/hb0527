package com.example.hb2009.calculatorapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_go;
    Button btn_go2;
    Button btn_test;
    Button btn_reserve;
    Button btn_timer;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        context = IntroActivity.this;

        btn_go = (Button) findViewById(R.id.btn_go);
        btn_go.setOnClickListener(this);

        btn_go2 = (Button) findViewById(R.id.btn_go2);
        btn_go2.setOnClickListener(this);

        btn_test = (Button) findViewById(R.id.btn_test);
        btn_test.setOnClickListener(this);

        btn_reserve = (Button) findViewById(R.id.btn_reserve);
        btn_reserve.setOnClickListener(this);

        btn_timer = (Button) findViewById(R.id.btn_timer);
        btn_timer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_go:
                //Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, MainActivity.class));
                break;

            case R.id.btn_go2:
                startActivity(new Intent(context, FastActivity.class));
                break;

            case R.id.btn_test:
                startActivity(new Intent(context, Main2Activity.class));
                break;

            case R.id.btn_reserve:
                startActivity(new Intent(context, ReserveActivity.class));
                break;

            case R.id.btn_timer:
                startActivity(new Intent(context, TimerActivity.class));
                break;
        }

//가급적 임시로 변수쓰는거 하지말고 바로 직접 쓰세요.

    }
}
