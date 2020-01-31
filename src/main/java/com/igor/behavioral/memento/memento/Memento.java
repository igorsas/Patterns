package com.igor.behavioral.memento.memento;

import com.igor.behavioral.memento.originator.File;

public class Memento {
    private File file;
    private String name;
    private String folderName;

    public Memento(File file, String name, String folderName) {
        this.file = file;
        this.name = name;
        this.folderName = folderName;
    }

    public void restore(){
        file.setName(name);
        file.setFolderName(folderName);
    }
}
