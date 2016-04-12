package com.wangyang.designpatterns.proxy;

/**
 * Created by yang.wang on 2016/4/11.
 * 中介买房
 */
public class Proxy implements BuyHouse {

    private People people;

    public Proxy() {
        people = new People();
    }

    @Override
    public void buy() {
        getInformation();
        people.buy();
    }


    private void getInformation() {
        System.out.println("找中介先了解下情况，再决定买房");
    }

}
