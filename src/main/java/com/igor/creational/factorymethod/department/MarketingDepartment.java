package com.igor.creational.factorymethod.department;

import com.igor.creational.factorymethod.model.MarketingStrategy;

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
