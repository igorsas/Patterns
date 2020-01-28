package com.igor.structural.decorator.decorator;

import com.igor.structural.decorator.model.Color;
import com.igor.structural.decorator.model.CompanyStuff;

public abstract class CompanyStuffDecorator extends CompanyStuff {
    protected CompanyStuff companyStuff;

    public CompanyStuffDecorator(Color color, CompanyStuff companyStuff) {
        super(color);
        this.companyStuff = companyStuff;
    }
}
