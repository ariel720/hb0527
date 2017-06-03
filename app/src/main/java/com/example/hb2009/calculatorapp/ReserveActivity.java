package com.example.hb2009.calculatorapp;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReserveActivity extends AppCompatActivity {
    String pick_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        TextView tv_today = (TextView) findViewById(R.id.tv_today);
        tv_today.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));//오늘날짜


        initView();



    }

    public void initView(){

        final Chronometer cm_1 = (Chronometer) findViewById(R.id.cm_1);
        final CalendarView cv_1 = (CalendarView) findViewById(R.id.cv_1);
        final TimePicker tp_1 = (TimePicker) findViewById(R.id.tp1);

        final TextView tv_year = (TextView) findViewById(R.id.tv_year);
        final TextView tv_month = (TextView) findViewById(R.id.tv_month);
        final TextView tv_date = (TextView) findViewById(R.id.tv_date);
        final TextView tv_hour = (TextView) findViewById(R.id.tv_hour);
        final TextView tv_min = (TextView) findViewById(R.id.tv_min);

        tp_1.setVisibility(View.INVISIBLE);
        cv_1.setVisibility(View.VISIBLE);

        //버튼 만들때는 findbyid 바로 써주세요.
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  cm_1.setBase(SystemClock.elapsedRealtime());
                cm_1.start();
                cm_1.setTextColor(Color.RED);*/
            }
        });

        findViewById(R.id.btn_end).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm_1.stop();
                cm_1.setTextColor(Color.BLUE);

                String[] arr = pick_date.split("-");

                tv_year.setText(arr[0]);
                tv_month.setText(arr[1]);
                tv_date.setText(arr[2]);

                tv_hour.setText(Integer.toString(tp_1.getHour()));
                tv_min.setText(Integer.toString(tp_1.getMinute()));
            }
        });
        
        //선택한 날짜 가져오기
        cv_1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                pick_date = year+"-"+(month+1)+"-"+dayOfMonth;
            }
        });



        findViewById(R.id.rb_cal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp_1.setVisibility(View.INVISIBLE);
                cv_1.setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.rb_time).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp_1.setVisibility(View.VISIBLE);
                cv_1.setVisibility(View.INVISIBLE);
            }
        });
    }

}
