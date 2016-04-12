package com.wangyang.designpatterns.decorator;

/**
 * Created by yang.wang on 2016/4/11.
 * 伪装者，实现了杀人的动作
 */
public class Decorator implements Kill{

    private RealKiller realKiller;

    public Decorator(RealKiller realKiller) {
        this.realKiller = realKiller;
    }

    @Override
    public void kill() {
        //这里调用了真正的杀人犯
        realKiller.kill();
    }
}
