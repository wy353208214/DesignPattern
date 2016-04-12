package com.wangyang.designpatterns.template;

/**
 * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，<br/>
 * 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 */
public class TestCalculator {

    public static void main(String[] args) {
        AbstractCalculate abstractCalculate = new CalculatorPlus();
        System.out.println("调用子类的方法：" + abstractCalculate.calculate(1, 2));
    }

}
