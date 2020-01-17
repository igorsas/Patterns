package com.igor.behavioral.factorymethod.department;

public abstract class Department {
    protected int employeesNumber;
    protected String departmentHead;

    public Department(int employeesNumber, String departmentHead) {
        this.employeesNumber = employeesNumber;
        this.departmentHead = departmentHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeesNumber=" + employeesNumber +
                ", departmentHead='" + departmentHead + '\'' +
                '}';
    }
}
