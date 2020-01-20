package com.igor.behavioral.builder.builder;

import com.igor.behavioral.builder.model.Bender;
import com.igor.behavioral.builder.model.Nation;

public class BenderBuilder {
    private Bender bender;

    public BenderBuilder(Nation nation, String name){
        bender = new Bender(nation, name);
    }

    public BenderBuilder refresh(Nation nation, String name){
        bender = new Bender(nation, name);
        return this;
    }

    public BenderBuilder addAirBending() {
        bender.setAirbending(true);
        return this;
    }

    public BenderBuilder addWaterBending() {
        bender.setWaterbending(true);
        return this;
    }

    public BenderBuilder addEarthBending() {
        bender.setEarthbending(true);
        return this;
    }

    public BenderBuilder addFireBending() {
        bender.setFirebending(true);
        return this;
    }

    public Bender build() {
        return bender;
    }
}
