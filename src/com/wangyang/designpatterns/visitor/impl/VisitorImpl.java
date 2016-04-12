package com.wangyang.designpatterns.visitor.impl;

import com.wangyang.designpatterns.visitor.IVisitor;
import com.wangyang.designpatterns.visitor.Subject;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class VisitorImpl implements IVisitor {

    @Override
    public void visit(Subject subject) {
        System.out.println("subject = [" + subject.getSubject() + "]");;
    }

}
