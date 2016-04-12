package com.wangyang.designpatterns.facade;

/**
 * 外观模式
 * 降低了类类之间的耦合度，该模式中没有涉及到接口
 */
public class TestFacade {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }

}
