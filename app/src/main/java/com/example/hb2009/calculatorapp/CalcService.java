package com.example.hb2009.calculatorapp;

/**
 * Created by hb2009 on 2017-05-27.
 */

public interface CalcService {
    public int plus(NumberBean bean);
    public int min(NumberBean bean);
    public int multi(NumberBean bean);
    public int divi(NumberBean bean); //() : 변수를 노출하지않고 객체전체를 넣어준다.

    //인터페이스에서는 {area}없는 메소드만 선언할수있음. 변수안됨. 변수 선언은 bean에.



}
