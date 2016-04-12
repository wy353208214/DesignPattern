package com.wangyang.designpatterns.visitor.impl;

import com.wangyang.designpatterns.visitor.IVisitor;
import com.wangyang.designpatterns.visitor.Subject;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class SubjectImpl implements Subject {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "访问的对象属性SubjectImpl";
    }
}
