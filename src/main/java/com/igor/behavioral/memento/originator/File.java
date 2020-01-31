package com.igor.behavioral.memento.originator;

import com.igor.behavioral.memento.memento.Memento;

public class File {
    private String name;
    private String folderName;

    public File(String name, String folderName) {
        this.name = name;
        this.folderName = folderName;
    }

    public Memento createMemento(){
        return new Memento(this, name, folderName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", folderName='" + folderName + '\'' +
                '}';
    }
}
