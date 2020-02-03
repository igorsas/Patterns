package com.igor.behavioral.visitor.visitor;

public class WatchTowerVisitor implements Visitor {
    @Override
    public void visitChristian() {
        System.out.println("To shake the faith in Jesus\n");
    }

    @Override
    public void visitMuslim() {
        System.out.println("You're dead\n");
    }

    @Override
    public void visitAtheist() {
        System.out.println("You're atheist now\n");
    }

    @Override
    public void visitWatchTowerMember() {
        System.out.println("You're confused, Drink blood with him)\n");
    }
}
