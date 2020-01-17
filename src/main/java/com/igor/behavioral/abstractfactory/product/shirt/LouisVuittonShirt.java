package com.igor.behavioral.abstractfactory.product.shirt;

import com.igor.behavioral.abstractfactory.model.Size;

public class LouisVuittonShirt extends Shirt {
    public LouisVuittonShirt(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Louis Vuitton shirt");
    }
}
