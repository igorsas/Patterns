package com.igor.behavioral.mediator.view;

import com.igor.behavioral.mediator.component.Bicycle;
import com.igor.behavioral.mediator.component.Car;
import com.igor.behavioral.mediator.component.Component;
import com.igor.behavioral.mediator.mediator.Mediator;
import com.igor.behavioral.mediator.mediator.TrafficLightMediator;
import com.igor.behavioral.mediator.model.Move;

public class View {
    public static void view() {
        Mediator mediator = new TrafficLightMediator();

        Component myCar = new Car(mediator);
        Component deputysCar = new Car(mediator);

        Component bicycle = new Bicycle(mediator);

        System.out.println("My car wanna go left");
        myCar.go(Move.LEFT);

        System.out.println("Deputy's car wanna go right");
        deputysCar.go(Move.RIGHT);

        System.out.println("Some bicycle wanna go straight ahead");
        bicycle.go(Move.STRAIGHT);
    }
}
