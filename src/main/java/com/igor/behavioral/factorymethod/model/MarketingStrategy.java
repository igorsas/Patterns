package com.igor.behavioral.factorymethod.model;

public enum MarketingStrategy {
    B2B("Business to business"),
    B2C("Business to consumer");

    private String type;

    MarketingStrategy(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
