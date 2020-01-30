package com.igor.behavioral.command.model;

public class MedicalCertificate {
    private String reason;
    private String doctorName;

    public MedicalCertificate(String reason, String doctorName) {
        this.reason = reason;
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "MedicalCertificate{" +
                "reason='" + reason + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
