package com.igor.creational.prototype.model;

import java.util.List;

public class Team {
    private List<Warrior> warriors;
    private String name;

    public Team(List<Warrior> warriors, String name) {
        this.warriors = warriors;
        this.name = name;
    }

    public List<Warrior> getWarriors() {
        return warriors;
    }

    public void setWarriors(List<Warrior> warriors) {
        this.warriors = warriors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasWarriors(){
        return warriors.size() > 0;
    }
}
