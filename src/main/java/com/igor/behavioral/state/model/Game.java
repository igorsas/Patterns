package com.igor.behavioral.state.model;

public class Game {
    private boolean isFree;
    private String name;

    public Game(boolean isFree, String name) {
        this.isFree = isFree;
        this.name = name;
    }

    public boolean isFree() {
        return isFree;
    }

    public String getName() {
        return name;
    }
}
