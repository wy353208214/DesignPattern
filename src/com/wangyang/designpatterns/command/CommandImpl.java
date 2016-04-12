package com.wangyang.designpatterns.command;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class CommandImpl implements ICommand {

    @Override
    public void exe() {
        System.out.println("最终要执行任务");
    }

}
