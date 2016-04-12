package com.wangyang.designpatterns.proxy;

/**
 * 代理模式就是多一个代理类出来，替原对象进行一些操作，比如我们在租房子的时候回去找中介，为什么呢？<br/>
 * 因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，此处的代理就是这个意思。<br/>
 * 代理模式的应用场景：<br/>
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：<br/>
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。<br/>
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。<br/>
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */
public class TestProxy {

    public static void main(String[] args) {
        BuyHouse buyHouse = new Proxy();
        buyHouse.buy();
    }
}
