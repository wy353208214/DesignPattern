package com.wangyang.designpatterns.prototype;

import java.io.IOException;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class TestPrototype {

    public static void main(String[] args) {
        People people = new People("小明", 2);
        Prototype prototype = new Prototype(people);
        try {
            Prototype clone1 = (Prototype) prototype.clone();
            Prototype clone2 = (Prototype) prototype.deepClone();

            System.out.println(prototype.toString());
            //注意引用类型不变
            System.out.println("潜复制：" + clone1.toString());
            //引用类型已经重新分配
            System.out.println("深复制：" + clone2.toString());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
