package com.wangyang.designpatterns.prototype;

import java.io.Serializable;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class People implements Serializable{
    private String name;
    private int sex;

    public People(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
