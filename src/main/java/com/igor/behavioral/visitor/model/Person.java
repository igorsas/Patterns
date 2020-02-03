package com.igor.behavioral.visitor.model;

import com.igor.behavioral.visitor.visitor.Visitor;

public interface Person {
    void accept(Visitor visitor);
}
