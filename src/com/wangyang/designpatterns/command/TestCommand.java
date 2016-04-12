package com.wangyang.designpatterns.command;

/**
 * 命令模式，需要一层层往下下发任务
 */
public class TestCommand {

    public static void main(String[] args) {
        ICommand command = new CommandImpl();
        Receiver reciver = new Receiver(command);
        Invoker invoker = new Invoker(reciver);
        invoker.doAction();
    }

}
