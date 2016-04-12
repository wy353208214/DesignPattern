package com.wangyang.designpatterns.proxy;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class People implements BuyHouse{

    @Override
    public void buy() {
        System.out.println("人们要去买房子");
    }

}
