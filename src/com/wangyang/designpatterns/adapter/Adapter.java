package com.wangyang.designpatterns.adapter;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Adapter extends Adaptee implements TargetInterface {

    @Override
    public void method2() {
        System.out.println("TargetInterface类的方法2");
    }

}
