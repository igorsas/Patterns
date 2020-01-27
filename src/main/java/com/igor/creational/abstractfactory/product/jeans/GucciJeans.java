package com.igor.creational.abstractfactory.product.jeans;

import com.igor.creational.abstractfactory.model.Size;

public class GucciJeans extends Jeans {
    public GucciJeans(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Gucci jeans");
    }
}
