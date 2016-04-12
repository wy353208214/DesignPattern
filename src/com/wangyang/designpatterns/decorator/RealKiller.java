package com.wangyang.designpatterns.decorator;

/**
 * Created by yang.wang on 2016/4/11.
 * 这个类是被装饰的人，他的操作都被隐藏起来了
 */
public class RealKiller implements Kill{

    @Override
    public void kill() {
        System.out.println(RealKiller.class.getName() + " 杀人犯");
    }

}
