package com.wangyang.designpatterns.strategy;

import com.wangyang.designpatterns.strategy.impl.Plus;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class TestStrategy {
    public static void main(String[] args) {
        ICalculator iCalculator = new Plus();
        System.out.println("计算的结果是：" + iCalculator.calculate(1, 2));
    }
}
