package com.igor.creational.abstractfactory.product.jeans;

import com.igor.creational.abstractfactory.model.Size;

public abstract class Jeans {
    protected Size size;

    public Jeans(Size size) {
        this.size = size;
    }

    public abstract void tellBrand();
}
