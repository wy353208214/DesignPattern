package com.wangyang.designpatterns.bridge;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Bridge {

    private Source source;

    public void method() {
        if (source == null)
            throw new NullPointerException("请注入source");
        source.method();
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
