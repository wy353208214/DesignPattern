package com.wangyang.designpatterns.strategy.impl;

import com.wangyang.designpatterns.strategy.ICalculator;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Subtract implements ICalculator {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }

}
