package com.wangyang.designpatterns.chain;

/**
 * 责任链模式
 */
public class TestChain {

    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("A");
        MyHandler handler2 = new MyHandler("B");
        MyHandler handler3 = new MyHandler("C");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler1);
        handler1.operator();
    }

}
