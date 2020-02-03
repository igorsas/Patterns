package com.igor.behavioral.visitor.model;

import com.igor.behavioral.visitor.visitor.Visitor;

public class Christian implements Person{
    //some logic

    @Override
    public void accept(Visitor visitor) {
        System.out.println("You're visiting Christian");
        visitor.visitChristian();
    }
}
