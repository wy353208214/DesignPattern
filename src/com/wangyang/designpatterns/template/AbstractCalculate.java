package com.wangyang.designpatterns.template;

/**
 * Created by yang.wang on 2016/4/11.
 */
public abstract class AbstractCalculate {

    public final int calculate(int a, int b) {
        return calculateChild(a, b);
    }

    abstract protected int calculateChild(int a, int b);


}
