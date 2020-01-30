package com.igor.behavioral.command.command.abstraction;

import com.igor.behavioral.command.model.EmployeeState;

public abstract class EmployeeCommand implements Command {
    protected boolean affectOthers;
    protected EmployeeState employeeState;

    public EmployeeCommand() {
        this.employeeState = new EmployeeState();
    }
}
