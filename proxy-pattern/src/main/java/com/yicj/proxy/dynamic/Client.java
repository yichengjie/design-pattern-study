package com.yicj.proxy.dynamic;

import com.yicj.proxy.pattern.RealSubject;
import com.yicj.proxy.pattern.Subject;

public class Client {

    public static void main(String[] args) {
        String name = "张三";
        Integer age = 18 ;
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true"); //设置系统属性
        Subject subject = JdkProxy.getProxy(new RealSubject(),new Class[]{Subject.class}) ;
        subject.request(name, age);
    }
}
