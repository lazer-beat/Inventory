package com.aincorp.inventory.business.flightcontrol.boundary;

import javax.annotation.PostConstruct;

/**
 * Created by Алмаз on 08.09.14.
 */
public class SplashScreen {
    @PostConstruct
    public void init() {
        System.out.println("SplashScreen.init()");
    }

    public String readyToTakeoff() {
        System.out.println("Ready to take-off");
        return "ok from splashScreen";
    }
}
