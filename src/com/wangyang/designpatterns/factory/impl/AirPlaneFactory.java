package com.wangyang.designpatterns.factory.impl;

import com.wangyang.designpatterns.factory.Factory;
import com.wangyang.designpatterns.factory.Transport;

/**
 * Created by yang.wang on 2016/4/8.
 */
public class AirPlaneFactory implements Factory {
    @Override
    public Transport produce() {
        return new AirPlaneTransport();
    }
}
