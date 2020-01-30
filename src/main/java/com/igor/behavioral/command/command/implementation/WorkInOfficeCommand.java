package com.igor.behavioral.command.command.implementation;

import com.igor.behavioral.command.command.abstraction.EmployeeCommand;

public class WorkInOfficeCommand extends EmployeeCommand {

    @Override
    public void execute() {
        employeeState.workInOffice();
    }
}
