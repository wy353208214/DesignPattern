package com.wangyang.designpatterns.builder;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class TestBuilder {

    public static void main(String[] args) {
        Builder builder = new BMWCarBuilder();
        builder.buildName();
        builder.buildPrice();
        Car car = builder.creatCar();
        car.toString();
    }

}
