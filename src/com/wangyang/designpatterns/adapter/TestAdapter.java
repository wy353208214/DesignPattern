package com.wangyang.designpatterns.adapter;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class TestAdapter {

    public static void main(String[] args) {
        TargetInterface targetInterface = new Adapter();
        targetInterface.method1();
        targetInterface.method2();
    }

}
