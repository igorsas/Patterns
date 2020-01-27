package com.igor.creational.prototype.model;

public class Defender extends Warrior {
    public Defender(int xp, int damage) {
        super(xp, damage);
    }

    private Defender(Defender defender){
        super(defender);
    }

    @Override
    public void specialForce() {
        xp += specialForce >= 100 ? damage : 0;
    }

    @Override
    public Defender clone() {
        return new Defender(this);
    }
}
