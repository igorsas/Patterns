package com.igor.behavioral.visitor.view;

import com.igor.behavioral.visitor.model.*;
import com.igor.behavioral.visitor.visitor.Visitor;
import com.igor.behavioral.visitor.visitor.WatchTowerVisitor;

public class View {
    public static void view() {
        Person[] persons = {new Muslim(), new Atheist(), new Christian(), new WatchTowerMember()};

        Visitor visitor = new WatchTowerVisitor();

        for (Person person: persons) {
            person.accept(visitor);
        }
    }
}
