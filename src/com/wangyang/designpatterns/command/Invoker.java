package com.wangyang.designpatterns.command;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Invoker {
    private Receiver reciver;

    public Invoker(Receiver reciver) {
        this.reciver = reciver;
    }

    public void doAction() {
        System.out.println("下发命令了，需要完成一些任务了");
        reciver.onReciver();
    }
}
