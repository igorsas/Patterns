package com.igor.behavioral.command.model;

import com.igor.behavioral.command.command.abstraction.EmployeeCommand;

import java.util.LinkedList;
import java.util.List;

public class PM {
    private final List<EmployeeCommand> employeeStates = new LinkedList<>();

    public PM registerEmployeeState(EmployeeCommand employeeState) {
        employeeStates.add(employeeState);
        return this;
    }

    public void showEmployeesStates(){
        for (EmployeeCommand employeeState: employeeStates) {
            employeeState.execute();
        }
        employeeStates.clear();
    }
}
