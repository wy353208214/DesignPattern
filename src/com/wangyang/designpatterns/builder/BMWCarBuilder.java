package com.wangyang.designpatterns.builder;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class BMWCarBuilder extends Builder{

    @Override
    public void buildPrice() {
        price = 10000;
        System.out.println("车价格是：" + price);
    }

    @Override
    public void buildName() {
        name = "宝马车";
        System.out.println("车名称是：" + name);
    }

}
