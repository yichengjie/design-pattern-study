package com.yicj.broadcast;

import com.yicj.event.WeatherEvent;
import com.yicj.listener.WeatherListener;

public interface EventMulticaster {

    void multicastEvent(WeatherEvent event) ;

    void addListener(WeatherListener listener) ;

    void removeListener(WeatherListener listener) ;
}
