package com.igor.behavioral.memento.view;

import com.igor.behavioral.memento.caretaker.FileManager;
import com.igor.behavioral.memento.originator.File;

public class View {
    public static void view() {
        FileManager fileManager = new FileManager();
        File file = new File("text.txt", "C");
        System.out.println("Initial state: " + file);

        fileManager.move(file, "D");
        System.out.println("After moving: " + file);

        fileManager.rename(file, "monkey.txt");
        System.out.println("After renaming: " + file);

        fileManager.undo();
        System.out.println("Undo previous operation: " + file);

        fileManager.undo();
        System.out.println("Undo again: " + file);
    }
}
