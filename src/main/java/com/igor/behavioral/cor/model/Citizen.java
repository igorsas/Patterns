package com.igor.behavioral.cor.model;

public class Citizen {
    private String name;
    private Problem problem;
    private String descriptor;

    public Citizen(String name, Problem problem, String descriptor) {
        this.name = name;
        this.problem = problem;
        this.descriptor = descriptor;
    }

    public String getName() {
        return name;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}

