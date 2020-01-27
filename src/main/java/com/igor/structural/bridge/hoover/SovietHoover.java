package com.igor.structural.bridge.hoover;

import java.util.Objects;

public class SovietHoover implements Hoover {
    protected boolean powerOn;
    protected int powerPercent;
    protected Bag bag;

    public SovietHoover(){
        super();
        System.out.println("Hoover: Creating hoover");
        powerPercent = 50;
    }

    @Override
    public boolean isOn() {
        System.out.println("Hoover: Checking power");
        return powerOn;
    }

    @Override
    public void turnOn() {
        System.out.println("Hoover: Turning on power");
        powerOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Hoover: Turning off power");
        powerOn = false;
    }

    @Override
    public int getPower() {
        System.out.println("Hoover: Getting power");
        return powerPercent;
    }

    @Override
    public void setPower(int percent) {
        System.out.println("Hoover: Setting power");
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percent is incorrect");
        }
        this.powerPercent = percent;
    }

    @Override
    public void throwBag() {
        System.out.println("Hoover: Throwing bag");
        bag = null;
    }

    @Override
    public void setBag() {
        System.out.println("Hoover: Setting bag");
        bag = new Bag();
    }

    @Override
    public boolean hasBag() {
        System.out.println("Hoover: Checking bag");
        return !Objects.isNull(bag);
    }
}
