package com.wangyang.designpatterns.chain;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;
    private int count = 0;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name);
        count++;
        if (getHandler() != null && count <= 10)
            getHandler().operator();
        else
            System.out.println("处理完成了");

    }

}
