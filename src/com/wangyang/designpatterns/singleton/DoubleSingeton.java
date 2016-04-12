package com.wangyang.designpatterns.singleton;

/**
 * Created by yang.wang on 2016/4/8.
 * 双重检锁模式<br/>
 * 优点是：线程安全 <br/>
 * 缺点是：在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();<br/>
 * 语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，<br/>
 * 然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例：<br/>
 * <h2/>a>A、B线程同时进入了第一个if判断<br/>
   b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();<br/>
   c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。<br/>
   d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。<br/>
   e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。<h2
 */
public class DoubleSingeton {

    private static DoubleSingeton singeton;

    private DoubleSingeton() {

    }

    public static DoubleSingeton getSingeton() {
        if (singeton == null) {
            synchronized (DoubleSingeton.class) {
                if (singeton == null)
                    singeton = new DoubleSingeton();
            }
        }
        return singeton;
    }

    /** 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getSingeton();
    }
}
