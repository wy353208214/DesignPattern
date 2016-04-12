package com.wangyang.designpatterns.bridge;

import com.wangyang.designpatterns.bridge.impl.Source1;
import com.wangyang.designpatterns.bridge.impl.Source2;

/**
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。<br/>
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，<br/>
 * 像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，<br/>
 * 在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，<br/>
 * 原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了
 */
public class TestBridge {

    public static void main(String[] args) {
        Source source1 = new Source1();
        Source source2 = new Source2();
        Bridge bridge = new Bridge();
        bridge.setSource(source1);
        bridge.method();
        bridge.setSource(source2);
        bridge.method();
    }

}
