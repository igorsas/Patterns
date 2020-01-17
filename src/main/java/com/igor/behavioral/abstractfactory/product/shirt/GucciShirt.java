package com.igor.behavioral.abstractfactory.product.shirt;

import com.igor.behavioral.abstractfactory.model.Size;

public class GucciShirt extends Shirt {
    public GucciShirt(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Gucci shirt");
    }
}
