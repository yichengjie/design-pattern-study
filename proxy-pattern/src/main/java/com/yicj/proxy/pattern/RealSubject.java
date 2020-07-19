package com.yicj.proxy.pattern;

public class RealSubject implements Subject {
    @Override
    public void request(String name , Integer age) {
        System.out.println("real subject execute request");
    }
}
