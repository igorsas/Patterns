package com.igor.structural.decorator.model;

public class Umbrella extends CompanyStuff {
    public Umbrella(Color color) {
        super(color);
    }

    @Override
    public void view() {
        System.out.print("It's umbrella with color: " + color);
    }
}
