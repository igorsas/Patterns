package com.igor.behavioral.command.command.implementation;

import com.igor.behavioral.command.command.abstraction.EmployeeCommand;

public class WorkFromHomeCommand extends EmployeeCommand {

    @Override
    public void execute() {
        employeeState.workFromHome();
        affectOthers = false;
    }
}
