package com.wangyang.designpatterns.singleton;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class TestSingleton {

    public static void main(String[] args) {
        DoubleSingeton doubleSingeton = DoubleSingeton.getSingeton();
        InnerClassSingleton innerClasseSingleton = InnerClassSingleton.getSingleton();
        System.out.println(doubleSingeton.toString());
        System.out.println(innerClasseSingleton.toString());
    }

}
