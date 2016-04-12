package com.wangyang.designpatterns.template;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class CalculatorPlus extends AbstractCalculate {

    @Override
    public int calculateChild(int a, int b) {
        return a + b;
    }
}
