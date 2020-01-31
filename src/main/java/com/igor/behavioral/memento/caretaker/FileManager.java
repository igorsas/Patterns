package com.igor.behavioral.memento.caretaker;

import com.igor.behavioral.memento.memento.Memento;
import com.igor.behavioral.memento.originator.File;

import java.util.LinkedList;

public class FileManager {
    private LinkedList<Memento> mementos;

    public FileManager() {
        this.mementos = new LinkedList<>();
    }

    public void move(File file, String folderName) {
        mementos.addFirst(file.createMemento());
        file.setFolderName(folderName);
    }

    public void rename(File file, String name){
        mementos.addFirst(file.createMemento());
        file.setName(name);
    }

    public void undo(){
        mementos.removeFirst().restore();
    }
}
