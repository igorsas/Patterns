package com.igor.behavioral.command.command.implementation;

import com.igor.behavioral.command.command.abstraction.EmployeeCommand;
import com.igor.behavioral.command.model.MedicalCertificate;

import java.util.Objects;

public class TakeSickLeaveCommand extends EmployeeCommand {
    private MedicalCertificate certificate;

    public TakeSickLeaveCommand(MedicalCertificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public void execute() {
        if (Objects.isNull(certificate)) {
            System.out.println("You should have medical certificate for taking sick leave");
            return;
        }
        employeeState.takeSickLeave(certificate);
        affectOthers = true;
    }
}
