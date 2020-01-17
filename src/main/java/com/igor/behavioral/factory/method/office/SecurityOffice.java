package com.igor.behavioral.factory.method.office;

import com.igor.behavioral.factory.method.department.SecurityDepartment;

public class SecurityOffice extends Office {
    public SecurityOffice(String name) {
        super(name);
    }

    public void createDepartment() {
        department = new SecurityDepartment(5, "Bad Guy", true);
    }
}
