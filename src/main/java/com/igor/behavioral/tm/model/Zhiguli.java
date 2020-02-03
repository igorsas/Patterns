package com.igor.behavioral.tm.model;

public class Zhiguli extends Car {

    @Override
    protected void startCar() {
        System.out.println("Try it again, sooner or later it'll be done");
    }

    @Override
    protected void buckleUp() {
        System.out.println("Here's no more buckles, sorry");
    }
}
