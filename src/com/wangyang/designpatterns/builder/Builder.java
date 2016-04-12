package com.wangyang.designpatterns.builder;

/**
 * Created by yang.wang on 2016/4/8.
 */
public abstract class Builder {
    private Car car;
    protected int price = 0;
    protected String name = null;


    public Car creatCar() {
        car = new Car();
        car.setName(name);
        car.setPrice(price);
        return car;
    }

    public abstract void buildPrice();
    public abstract void buildName();

}
