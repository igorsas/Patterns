package com.igor.structural.flyweight.model;

import java.util.Random;

public enum  TransformerType {
    DECEPTIONS, AUTOBOT;

    public static TransformerType getRandomType(){
        return new Random().nextBoolean() ? DECEPTIONS : AUTOBOT;
    }
}
