package com.igor.creational.abstractfactory.product.jeans;

import com.igor.creational.abstractfactory.model.Size;

public class LouisVuittonJeans extends Jeans{
    public LouisVuittonJeans(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Louis Vuitton jeans");
    }
}
