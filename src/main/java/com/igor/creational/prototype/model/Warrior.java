package com.igor.creational.prototype.model;

public abstract class Warrior implements Cloneable {
    protected int xp;
    protected int damage;
    protected int specialForce;

    public Warrior(int xp, int damage) {
        this.xp = xp;
        this.damage = damage;
        this.specialForce = 0;
    }

    public Warrior(Warrior warrior) {
        this.xp = warrior.xp;
        this.damage = warrior.damage;
        this.specialForce = warrior.specialForce;
    }

    public void attack(Warrior warrior) {
        warrior.xp -= this.damage;
    }

    public boolean isAlive(){
        return xp > 0;
    }

    public abstract void specialForce();

    @Override
    public abstract Warrior clone();
}
