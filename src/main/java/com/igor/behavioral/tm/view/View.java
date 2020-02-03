package com.igor.behavioral.tm.view;

import com.igor.behavioral.tm.model.Car;
import com.igor.behavioral.tm.model.Tesla;
import com.igor.behavioral.tm.model.Zhiguli;

public class View {
    public static void view() {
        Car car = new Zhiguli();
        System.out.println("Zhiguli driving");
        car.drive();
        car = new Tesla();
        System.out.println("Tesla driving");
        car.drive();
    }
}
