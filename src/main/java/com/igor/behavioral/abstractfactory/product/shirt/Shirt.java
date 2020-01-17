package com.igor.behavioral.abstractfactory.product.shirt;

import com.igor.behavioral.abstractfactory.model.Size;

public abstract class Shirt {
    protected Size size;

    public Shirt(Size size) {
        this.size = size;
    }

    public abstract void tellBrand();
}
