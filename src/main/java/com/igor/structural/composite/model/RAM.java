package com.igor.structural.composite.model;

import com.igor.structural.composite.model.Detail;

public class RAM implements Detail {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
