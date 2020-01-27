package com.igor.structural.bridge.hoover;

public interface Hoover {
    boolean isOn();

    void turnOn();

    void turnOff();

    int getPower();

    void setPower(int percent);

    void throwBag();

    void setBag();

    boolean hasBag();
}
