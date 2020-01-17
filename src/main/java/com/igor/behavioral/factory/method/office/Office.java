package com.igor.behavioral.factory.method.office;

import com.igor.behavioral.factory.method.department.Department;

public abstract class Office {
    protected String name;
    protected Department department;

    public Office(String name) {
        this.name = name;
    }

    public void showDepartment(){
        System.out.println(department);
    }

    public abstract void createDepartment();
}
