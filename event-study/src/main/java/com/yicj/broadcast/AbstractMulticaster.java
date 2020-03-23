package com.yicj.broadcast;

import com.yicj.event.WeatherEvent;
import com.yicj.listener.WeatherListener;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMulticaster implements EventMulticaster {

    private List<WeatherListener> listeners = new ArrayList<WeatherListener>() ;

    public void multicastEvent(final WeatherEvent event) {
        doStart() ;
        listeners.forEach(l -> l.onWeatherEvent(event));
        doEnd() ;
    }

    public void addListener(WeatherListener listener) {
        this.listeners.add(listener) ;
    }

    public void removeListener(WeatherListener listener) {
        this.listeners.remove(listener) ;
    }

    protected abstract void doStart();

    protected abstract void doEnd();
}
