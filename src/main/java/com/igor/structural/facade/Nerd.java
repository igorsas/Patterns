package com.igor.structural.facade;

public class Nerd {
    public String getCoursework(String studentName){
        Coursework coursework = new Coursework();
        return coursework.writeTitle()
                .writeTarget()
                .resolveProblem()
                .writeSign(studentName);
    }
}
