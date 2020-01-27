package com.igor.creational.abstractfactory.product.shirt;

import com.igor.creational.abstractfactory.model.Size;

public class GucciShirt extends Shirt {
    public GucciShirt(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Gucci shirt");
    }
}
