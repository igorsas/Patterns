package com.igor.structural.decorator.decorator;

import com.igor.structural.decorator.model.CompanyStuff;

public class StuffWithCompanySloganDecorator extends CompanyStuffDecorator{
    private String companySlogan;

    public StuffWithCompanySloganDecorator(CompanyStuff companyStuff, String companySlogan) {
        super(companyStuff.getColor(), companyStuff);
        this.companySlogan = companySlogan;
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    @Override
    public void view() {
        companyStuff.view();
        System.out.print(", company slogan: " + companySlogan);
    }
}
