package com.igor.behavioral.abstractfactory.product.shoes;

import com.igor.behavioral.abstractfactory.model.Size;

public class GucciShoes extends Shoes {
    public GucciShoes(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Gucci shoes");
    }
}
