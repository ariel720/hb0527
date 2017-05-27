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
        }

//가급적 임시로 변수쓰는거 하지말고 바로 직접 쓰세요.

    }
}
