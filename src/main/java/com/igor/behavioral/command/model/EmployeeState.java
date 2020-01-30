package com.igor.behavioral.command.model;

public class EmployeeState {
    public void workFromHome(){
        System.out.println("Sorry, I don't feel good, so I'm staying at home");
    }

    public void takeSickLeave(MedicalCertificate certificate){
        System.out.println("I feel terrible. I can't work today. Medical certificate attached");
        System.out.println(certificate);
    }

    public void takeVacation(){
        System.out.println("I'm going to Korea today. I'll be 'sukat' Korean girls today)");
    }

    public void workInOffice(){
        System.out.println("Ok, I'm going to office. I have to gossip with Olenka))");
    }
}
