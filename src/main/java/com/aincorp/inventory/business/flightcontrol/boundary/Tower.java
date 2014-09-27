package com.aincorp.inventory.business.flightcontrol.boundary;

import javax.annotation.PostConstruct;

/**
 * @author
 */
public class Tower {

    @PostConstruct
    public void init() {
        System.out.println("Tower.init()");
    }

    public String readyToTakeoff() {
        System.out.println("Ready to take-off");
        return "ok from tower";
    }
}
