package com.igor.creational.abstractfactory.product.shirt;

import com.igor.creational.abstractfactory.model.Size;

public abstract class Shirt {
    protected Size size;

    public Shirt(Size size) {
        this.size = size;
    }

    public abstract void tellBrand();
}
