package com.wangyang.designpatterns.factory.impl;

import com.wangyang.designpatterns.factory.Transport;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class AirPlaneTransport implements Transport {

    @Override
    public void move() {
        System.out.println("This is AirPlane");
    }

}
