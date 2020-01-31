package com.igor.behavioral.observer.model;

public class Score {
    private int firstTeamAmountGoals;
    private int secondTeamAmountGoals;

    public Score() {
        firstTeamAmountGoals = 0;
        secondTeamAmountGoals = 0;
    }

    public void firstTeamGoal() {
        this.firstTeamAmountGoals++;
    }

    public void secondTeamGoal() {
        this.secondTeamAmountGoals++;
    }

    public int getFirstTeamAmountGoals() {
        return firstTeamAmountGoals;
    }

    public int getSecondTeamAmountGoals() {
        return secondTeamAmountGoals;
    }

    @Override
    public String toString() {
        return firstTeamAmountGoals + ":" + secondTeamAmountGoals;
    }
}
