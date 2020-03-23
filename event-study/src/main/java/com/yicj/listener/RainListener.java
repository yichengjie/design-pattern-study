package com.yicj.listener;

import com.yicj.event.RainEvent;
import com.yicj.event.SnowEvent;
import com.yicj.event.WeatherEvent;

public class RainListener implements WeatherListener {

    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof RainEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
