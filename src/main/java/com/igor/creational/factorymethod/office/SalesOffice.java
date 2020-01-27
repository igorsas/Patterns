package com.igor.creational.factorymethod.office;

import com.igor.creational.factorymethod.department.MarketingDepartment;
import com.igor.creational.factorymethod.model.MarketingStrategy;

public class SalesOffice extends Office {
    public SalesOffice(String name) {
        super(name);
    }

    @Override
    public void createDepartment() {
        department = new MarketingDepartment(20, "Peter Pan", MarketingStrategy.B2B);
    }
}
