package com.yicj.proxy.pattern;

public class Client {

    public static void main(String[] args) {
        String name = "张三";
        Integer age = 18 ;
        Subject subject = new Proxy(new RealSubject()) ;
        subject.request(name, age);
    }
}
