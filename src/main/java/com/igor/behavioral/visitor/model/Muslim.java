package com.igor.behavioral.visitor.model;

import com.igor.behavioral.visitor.visitor.Visitor;

public class Muslim implements Person{
    //some logic

    @Override
    public void accept(Visitor visitor) {
        System.out.println("You're visiting Muslim");
        visitor.visitMuslim();
    }
}
