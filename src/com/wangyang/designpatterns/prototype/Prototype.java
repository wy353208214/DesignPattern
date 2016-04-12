package com.wangyang.designpatterns.prototype;

import java.io.*;

/**
 * Created by yang.wang on 2016/4/11.
 * 原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象<br/>
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。<br/>
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 *
 */
public class Prototype implements Cloneable, Serializable{

    private static final long serialVersionUID = 1L;

    private People people;

    public Prototype(People people) {
        this.people = people;
    }

    /**
     * 浅复制，直接实现cloneable接口即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制，要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oout = new ObjectOutputStream(out);
        oout.writeObject(this);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream oin = new ObjectInputStream(in);
        return oin.readObject();
    }


    @Override
    public String toString() {
        return "Prototype{" +
                "people=" + people +
                '}';
    }

}
