package com.wangyang.designpatterns.bridge.impl;

import com.wangyang.designpatterns.bridge.Source;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Source2 implements Source {

    @Override
    public void method() {
        System.out.println("实现类2中的方法");
    }

}
