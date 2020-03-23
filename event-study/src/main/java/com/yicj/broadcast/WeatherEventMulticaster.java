package com.yicj.broadcast;

public class WeatherEventMulticaster extends AbstractMulticaster {
    @Override
    protected void doStart() {
        System.out.println("begin broadcast weather event .");
    }

    @Override
    protected void doEnd() {
        System.out.println("end broadcast weather event .");
    }
}
