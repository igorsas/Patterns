package com.igor.creational.factorymethod.office;

import com.igor.creational.factorymethod.department.SecurityDepartment;

public class SecurityOffice extends Office {
    public SecurityOffice(String name) {
        super(name);
    }

    public void createDepartment() {
        department = new SecurityDepartment(5, "Bad Guy", true);
    }
}
