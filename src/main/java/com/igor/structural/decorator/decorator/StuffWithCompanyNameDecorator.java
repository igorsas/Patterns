package com.igor.structural.decorator.decorator;

import com.igor.structural.decorator.model.CompanyStuff;

public class StuffWithCompanyNameDecorator extends CompanyStuffDecorator {
    private String companyName;

    public StuffWithCompanyNameDecorator(CompanyStuff companyStuff, String companyName) {
        super(companyStuff.getColor(), companyStuff);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void view() {
        companyStuff.view();
        System.out.print(", company name: " + companyName);
    }
}
