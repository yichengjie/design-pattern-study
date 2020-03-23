package com.yicj.listener;

import com.yicj.event.SnowEvent;
import com.yicj.event.WeatherEvent;

public class SnowListener implements WeatherListener {

    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof SnowEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
