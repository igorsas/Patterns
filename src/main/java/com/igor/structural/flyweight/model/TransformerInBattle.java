package com.igor.structural.flyweight.model;

public class TransformerInBattle {
    private int x;
    private int y;
    private Transformer transformer;

    public TransformerInBattle(int x, int y, Transformer transformer) {
        this.x = x;
        this.y = y;
        this.transformer = transformer;
    }

    @Override
    public String toString() {
        return "TransformerInBattle{" +
                "x=" + x +
                ", y=" + y +
                ", transformer=" + transformer +
                '}';
    }
}
