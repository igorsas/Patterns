package com.igor.behavioral.observer.model;

public class Match {
    private String firstTeam;
    private String secondTeam;
    private Score score;

    public Match(String firstTeam, String secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        score = new Score();
    }

    public void goal(String teamName) {
        if (teamName.equals(firstTeam)) {
            score.firstTeamGoal();
            System.out.println(teamName + " scored goal: " + this.toString());
        } else if (teamName.equals(secondTeam)) {
            score.secondTeamGoal();
            System.out.println(teamName + " scored goal: " + this.toString());
        } else System.out.println("We don't have such team");
    }

    public void finishGame() {
        System.out.println("Match finished. Result: " + this.toString());
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public Score getScore() {
        return score;
    }

    @Override
    public String toString() {
        return firstTeam + " " + score + " " + secondTeam;
    }
}
