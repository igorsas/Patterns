package com.igor.structural.flyweight.model;

import com.igor.structural.flyweight.factory.TransformerFactory;

import java.util.ArrayList;
import java.util.List;

public class TransformerArmy {
    private List<TransformerInBattle> army;

    public TransformerArmy() {
        army = new ArrayList<>();
    }

    public void addTransformer(int x, int y, String name, TransformerType transformerType) {
        Transformer transformer = TransformerFactory.getTransformer(name, transformerType);
        TransformerInBattle transformerInBattle = new TransformerInBattle(x, y, transformer);
        army.add(transformerInBattle);
    }

    public void showArmy() {
        army.forEach(System.out::println);
    }
}
