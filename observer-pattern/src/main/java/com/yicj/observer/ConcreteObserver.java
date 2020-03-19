package com.yicj.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 */
public class ConcreteObserver implements Observer {

    //观察者的状态
    private String observeState ;


    public void update(Subject subject) {
        this.observeState = ((ConcreteSubject)subject).getSubjectState() ;
    }
}
