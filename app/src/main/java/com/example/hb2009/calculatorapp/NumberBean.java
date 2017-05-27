package com.example.hb2009.calculatorapp;

/**
 * Created by hb2009 on 2017-05-27.
 */

public class NumberBean {
   private int firstNum,secondNum,resultNum;

    /*alt+isnert :private 변수의 getter setter 만들기*/

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int getResultNum() {
        return resultNum;
    }

    public void setResultNum(int resultNum) {
        this.resultNum = resultNum;
    }

    @Override
    public String toString() {
        /*alt+isnert :toString : 디버깅 용도*/
        return "NumberBean{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", resultNum=" + resultNum +
                '}';
    }
}
