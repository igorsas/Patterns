package com.igor.behavioral.cor.servant;

import com.igor.behavioral.cor.model.Problem;

public class President extends CivilServant {
    @Override
    public void resolveProblem(Problem problem, String description) {
        if(problem == Problem.GLOBAL){
            System.out.println("President can help you. Problem (" + description + ") will be resolved when all be ZEiebis`!");
        }else {
            System.out.println("Call Gretta Tunberg, she's definitely can resolve this");
        }
    }
}
