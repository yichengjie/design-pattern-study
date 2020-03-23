package com.yicj;

import com.yicj.broadcast.WeatherEventMulticaster;
import com.yicj.event.RainEvent;
import com.yicj.event.SnowEvent;
import com.yicj.listener.RainListener;
import com.yicj.listener.SnowListener;

public class Test {

    public static void main(String[] args) {
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        eventMulticaster.addListener(rainListener);
        eventMulticaster.addListener(snowListener);

        eventMulticaster.multicastEvent(new SnowEvent());

        eventMulticaster.multicastEvent(new RainEvent());

        eventMulticaster.removeListener(rainListener);
        System.out.println("==================================");

        eventMulticaster.multicastEvent(new SnowEvent());

        eventMulticaster.multicastEvent(new RainEvent());
    }

}
