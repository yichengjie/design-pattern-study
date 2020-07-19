package com.yicj.proxy.cglib;

import com.yicj.proxy.pattern.RealSubject;
import com.yicj.proxy.pattern.Subject;

public class Client {

    public static void main(String[] args) {
        String name = "张三";
        Integer age = 18 ;
        Subject subject = CglibProxy.getProxy(RealSubject.class) ;
        subject.request(name, age);
    }
}
