package com.igor.behavioral.factorymethod.office;

import com.igor.behavioral.factorymethod.department.MarketingDepartment;
import com.igor.behavioral.factorymethod.model.MarketingStrategy;

public class SalesOffice extends Office {
    public SalesOffice(String name) {
        super(name);
    }

    @Override
    public void createDepartment() {
        department = new MarketingDepartment(20, "Peter Pan", MarketingStrategy.B2B);
    }
}
