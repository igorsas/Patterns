package com.igor.behavioral.command.view;

import com.igor.behavioral.command.command.implementation.TakeSickLeaveCommand;
import com.igor.behavioral.command.command.implementation.TakeVacationCommand;
import com.igor.behavioral.command.command.implementation.WorkFromHomeCommand;
import com.igor.behavioral.command.command.implementation.WorkInOfficeCommand;
import com.igor.behavioral.command.model.MedicalCertificate;
import com.igor.behavioral.command.model.PM;

public class View {
    public static void view(){
        PM pm = new PM();
        pm.registerEmployeeState(new TakeSickLeaveCommand(new MedicalCertificate("Headache", "Dr. Haus")))
                .registerEmployeeState(new TakeVacationCommand())
                .registerEmployeeState(new WorkFromHomeCommand())
                .registerEmployeeState(new WorkInOfficeCommand());

        pm.showEmployeesStates();
    }
}
