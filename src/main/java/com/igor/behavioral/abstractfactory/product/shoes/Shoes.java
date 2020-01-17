package com.igor.behavioral.abstractfactory.product.shoes;

import com.igor.behavioral.abstractfactory.model.Size;

public abstract class Shoes {
    protected Size size;

    public Shoes(Size size) {
        this.size = size;
    }

    public abstract void tellBrand();
}
