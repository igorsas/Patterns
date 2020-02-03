package com.igor.behavioral.strategy.view;

import com.igor.behavioral.strategy.model.AI;
import com.igor.behavioral.strategy.strategy.AINowadaysStrategy;
import com.igor.behavioral.strategy.strategy.AIWithSoulStrategy;
import com.igor.behavioral.strategy.strategy.AIWithoutSoulAndWithHugePowerStrategy;

public class View {
    public static void view() {
        AI ai = new AI();
        ai.setAiStrategy(new AINowadaysStrategy());
        System.out.println("AI nowadays: ");
        ai.doThing();
        ai.setAiStrategy(new AIWithSoulStrategy());
        System.out.println("AI with soul: ");
        ai.doThing();
        ai.setAiStrategy(new AIWithoutSoulAndWithHugePowerStrategy());
        System.out.println("AI will win..: ");
        ai.doThing();
    }
}
