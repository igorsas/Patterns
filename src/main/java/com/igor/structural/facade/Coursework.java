package com.igor.structural.facade;

public class Coursework {
    private String courseWork;

    public Coursework(){
        courseWork = "";
    }

    public Coursework writeTitle(){
        courseWork += "Microbiologics methodologics\n";
        return this;
    }

    public Coursework writeTarget(){
        courseWork +=  "Find treatment from coronavirus.\n";
        return this;
    }

    public Coursework resolveProblem(){
        courseWork +=  "That's it. Easy peasy.\n";
        return this;
    }

    public String writeSign(String name){
        courseWork += "The name who've done this is " + name + "\n";
        return courseWork;
    }
}
