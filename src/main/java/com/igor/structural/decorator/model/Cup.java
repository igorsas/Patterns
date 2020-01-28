package com.igor.structural.decorator.model;

public class Cup extends CompanyStuff {

    public Cup(Color color) {
        super(color);
    }

    @Override
    public void view() {
        System.out.print("It's cup with color: " + color);
    }
}
