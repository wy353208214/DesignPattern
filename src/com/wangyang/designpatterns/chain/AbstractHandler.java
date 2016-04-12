package com.wangyang.designpatterns.chain;

/**
 * Created by yang.wang on 2016/4/11.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
