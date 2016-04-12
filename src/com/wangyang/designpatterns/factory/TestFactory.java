package com.wangyang.designpatterns.factory;

import com.wangyang.designpatterns.factory.impl.AirPlaneFactory;
import com.wangyang.designpatterns.factory.impl.CarFactory;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class TestFactory {

    public static void main(String[] args) {
        Factory car = new CarFactory();
        Factory airPlane = new AirPlaneFactory();
        Transport carTransport = car.produce();
        Transport airPlaneTransport = airPlane.produce();
        carTransport.move();
        airPlaneTransport.move();
    }

}
