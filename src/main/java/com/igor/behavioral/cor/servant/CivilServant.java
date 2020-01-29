package com.igor.behavioral.cor.servant;

import com.igor.behavioral.cor.model.Problem;

public abstract class CivilServant {
    protected CivilServant nextServant;

    public CivilServant addMoreCompetent(CivilServant civilServant){
        this.nextServant = civilServant;
        return civilServant;
    }

    public abstract void resolveProblem(Problem problem, String description);
}
