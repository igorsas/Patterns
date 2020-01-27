package com.igor.creational.factorymethod.department;

public class SecurityDepartment extends Department {
    private boolean allowedFirearms;

    public SecurityDepartment(int employeesNumber, String departmentHead, boolean allowedFirearms) {
        super(employeesNumber, departmentHead);
        this.allowedFirearms = allowedFirearms;
    }

    @Override
    public String toString() {
        return "This is security department: SecurityDepartment{" +
                "allowedFirearms=" + allowedFirearms +
                '}';
    }
}
