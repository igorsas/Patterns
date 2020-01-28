package com.igor.structural.decorator.model;

public abstract class CompanyStuff {
    protected Color color;

    public CompanyStuff(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void view();
}
