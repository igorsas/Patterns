package com.igor.structural.bridge.controller;

import com.igor.structural.bridge.hoover.Hoover;

public class AdvancedController extends Controller {
    public AdvancedController(Hoover hoover) {
        super(hoover);
    }

    public void powerUp() {
        System.out.println("Controller: increasing power");
        hoover.setPower(hoover.getPower() + 5);
    }

    public void powerDown() {
        System.out.println("Controller: decreasing power");
        hoover.setPower(hoover.getPower() - 5);
    }

    public void changeBag() {
        System.out.println("Controller: changing bag");
        if (!hoover.hasBag())
            hoover.throwBag();
        hoover.setBag();
    }
}
