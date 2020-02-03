package com.igor.behavioral.tm.model;

public abstract class Car {
    public void drive(){
        buckleUp();
        startCar();
        chooseGear();
        go();
    }

    protected void go(){
        System.out.println("You're going");
    }

    protected void chooseGear(){
        System.out.println("By default here's the first gear");
    }

    protected abstract void startCar();

    protected abstract void buckleUp();
}
