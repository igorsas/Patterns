package com.igor.creational.prototype.model;

public class Bowman extends Warrior {

    public Bowman(int xp, int damage) {
        super(xp, damage);
    }

    private Bowman(Bowman bowman){
        super(bowman);
    }

    @Override
    public void specialForce() {
        damage += specialForce >= 100 ? damage-xp : 0;
    }

    @Override
    public Bowman clone() {
        return new Bowman(this);
    }
}
