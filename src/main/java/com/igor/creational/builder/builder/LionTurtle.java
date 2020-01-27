package com.igor.creational.builder.builder;

import com.igor.creational.builder.model.Bending;

import java.util.List;

public class LionTurtle {
    public void createBender(BenderBuilder benderBuilder, List<Bending> bending) {
        for (Bending value : bending) {
            switch (value) {
                case AIRBENDING:
                    benderBuilder.addAirBending();
                    break;
                case FIREBENDING:
                    benderBuilder.addFireBending();
                    break;
                case EARTHBENDING:
                    benderBuilder.addEarthBending();
                    break;
                case WATERBENDING:
                    benderBuilder.addWaterBending();
                    break;
            }
        }
    }
}
