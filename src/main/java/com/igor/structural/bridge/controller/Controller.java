package com.igor.structural.bridge.controller;

import com.igor.structural.bridge.hoover.Hoover;

public class Controller {
    protected Hoover hoover;

    public Controller(Hoover hoover) {
        System.out.println("Controller: creating controller");
        this.hoover = hoover;
    }

    public void togglePower(){
        System.out.println("Controller: toggling power");
        if (hoover.isOn()) {
            hoover.turnOff();
        } else {
            hoover.turnOn();
        }
    }
}
