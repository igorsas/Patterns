package com.igor.behavioral.mediator.mediator;

import com.igor.behavioral.mediator.component.Bicycle;
import com.igor.behavioral.mediator.component.Car;
import com.igor.behavioral.mediator.component.Component;
import com.igor.behavioral.mediator.model.Move;

public class TrafficLightMediator implements Mediator {
    private Component car;
    private Component bicycle;

    public TrafficLightMediator() {
        this.car = new Car(this);
        this.bicycle = new Bicycle(this);
    }

    @Override
    public void obey(Component component, Move move) {
        if (component.equals(car)) {
            if (move == Move.RIGHT) {
                System.out.println("GREEN");
            } else {
                System.out.println("RED");
            }
        }else if(component.equals(bicycle)){
            System.out.println("YELLOW");
        }
    }
}
