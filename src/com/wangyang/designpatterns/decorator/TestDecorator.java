package com.wangyang.designpatterns.decorator;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class TestDecorator {

    public static void main(String[] args) {
        RealKiller realKiller = new RealKiller();
        Decorator decorator = new Decorator(realKiller);
        decorator.kill();
    }
}
