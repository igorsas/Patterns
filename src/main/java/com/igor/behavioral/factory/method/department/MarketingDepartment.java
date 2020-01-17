package com.igor.behavioral.factory.method.department;

import com.igor.behavioral.factory.method.model.MarketingStrategy;

public class MarketingDepartment extends Department {
    private MarketingStrategy strategyType;

    public MarketingDepartment(int employeesNumber, String departmentHead, MarketingStrategy strategyType) {
        super(employeesNumber, departmentHead);
        this.strategyType = strategyType;
    }

    @Override
    public String toString() {
        return "This is marketing department: MarketingDepartment{" +
                "strategyType=" + strategyType +
                '}';
    }
}
