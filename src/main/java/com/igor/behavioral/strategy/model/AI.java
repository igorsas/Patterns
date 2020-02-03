package com.igor.behavioral.strategy.model;

import com.igor.behavioral.strategy.strategy.AIStrategy;

public class AI {
    private AIStrategy aiStrategy;

    public void setAiStrategy(AIStrategy aiStrategy) {
        this.aiStrategy = aiStrategy;
    }

    public void doThing(){
        aiStrategy.doThing();
    }
}
