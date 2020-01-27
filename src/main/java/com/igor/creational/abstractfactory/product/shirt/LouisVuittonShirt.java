package com.igor.creational.abstractfactory.product.shirt;

import com.igor.creational.abstractfactory.model.Size;

public class LouisVuittonShirt extends Shirt {
    public LouisVuittonShirt(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Louis Vuitton shirt");
    }
}
