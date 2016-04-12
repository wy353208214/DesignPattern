package com.wangyang.designpatterns.builder;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class Car {

    private int price;
    private String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
