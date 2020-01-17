package com.igor.behavioral.factory.method.office;

import com.igor.behavioral.factory.method.department.Department;
import com.igor.behavioral.factory.method.department.MarketingDepartment;
import com.igor.behavioral.factory.method.model.MarketingStrategy;

public class SalesOffice extends Office {
    public SalesOffice(String name) {
        super(name);
    }

    @Override
    public void createDepartment() {
        department = new MarketingDepartment(20, "Peter Pan", MarketingStrategy.B2B);
    }
}
