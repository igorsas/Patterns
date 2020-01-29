package com.igor.behavioral.cor.servant;

import com.igor.behavioral.cor.model.Problem;

public class VillageCouncil extends CivilServant {
    @Override
    public void resolveProblem(Problem problem, String description) {
        if(problem == Problem.LOCAL){
            System.out.println("Village council take it by his control. Problem (" + description + ") will be resolved in the nearest future!");
        }else {
            nextServant.resolveProblem(problem, description);
        }
    }
}
