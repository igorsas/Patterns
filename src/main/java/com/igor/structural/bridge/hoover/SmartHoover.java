package com.igor.structural.bridge.hoover;

public class SmartHoover extends SovietHoover {
    private int batteryPower;

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        System.out.println("Hoover: Battery power changing");
        this.batteryPower = batteryPower;
    }
}
