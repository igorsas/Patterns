package com.igor.behavioral.tm.model;

public class Tesla extends Car{
    @Override
    protected void startCar() {
        System.out.println("Scanning your face... Approved. Enjoy your trip");
    }

    @Override
    protected void buckleUp() {
        System.out.println("Automatically done");
    }
}
