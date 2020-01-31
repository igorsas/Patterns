package com.igor.behavioral.observer.subscriber;

import com.igor.behavioral.observer.model.Event;
import com.igor.behavioral.observer.model.Match;

public class Subscriber {
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public Subscriber(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void takeEvent(Event event, Match match){
        System.out.println(this + " take event: " + event + " to match: " + match);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
