package com.example.hb2009.calculatorapp;

/**
 * Created by hb2009 on 2017-05-27.
 */

public class CalcServiceImpl implements CalcService{
    @Override
    public int plus(NumberBean bean) {

        return bean.getFirstNum()+bean.getSecondNum();
    }

    @Override
    public int min(NumberBean bean) {
        return bean.getFirstNum()-bean.getSecondNum();
    }

    @Override
    public int multi(NumberBean bean) {
        return bean.getFirstNum()*bean.getSecondNum();
    }

    @Override
    public int divi(NumberBean bean) {
        return bean.getFirstNum()/bean.getSecondNum();
    }
}
