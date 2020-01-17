package com.igor.behavioral.abstractfactory.product.jeans;

import com.igor.behavioral.abstractfactory.model.Size;

public abstract class Jeans {
    protected Size size;

    public Jeans(Size size) {
        this.size = size;
    }

    public abstract void tellBrand();
}
