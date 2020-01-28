package com.igor.structural.flyweight.view;

import com.igor.structural.flyweight.model.TransformerArmy;
import com.igor.structural.flyweight.model.TransformerType;

import java.util.Random;

public class View {

    public static void view() {
        TransformerArmy transformerArmy = new TransformerArmy();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            transformerArmy.addTransformer( random.nextInt(100), random.nextInt(100), "Megatron", TransformerType.getRandomType());
            transformerArmy.addTransformer(random.nextInt(200), random.nextInt(200), "Bumblebee ", TransformerType.getRandomType());
        }
        transformerArmy.showArmy();
    }
}
