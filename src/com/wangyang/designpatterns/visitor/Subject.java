package com.wangyang.designpatterns.visitor;

/**
 * Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
 */
public interface Subject {
    void accept(IVisitor visitor);
    String getSubject();
}
