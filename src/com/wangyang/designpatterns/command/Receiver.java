package com.wangyang.designpatterns.command;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Receiver {

    private ICommand command;

    public Receiver(ICommand command) {
        this.command = command;
    }

    public void onReciver() {
        System.out.println("收到任务了");
        command.exe();
    }

}
