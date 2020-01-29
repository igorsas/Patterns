package com.igor.behavioral.cor.servant;

import com.igor.behavioral.cor.model.Problem;

public class Delegate extends CivilServant {
    @Override
    public void resolveProblem(Problem problem, String description) {
        if(problem == Problem.REGIONAL){
            System.out.println("Delegate can resolve this shit. Problem (" + description + ") will be resolved when delegate will be free!");
        }else {
            nextServant.resolveProblem(problem, description);
        }
    }
}
