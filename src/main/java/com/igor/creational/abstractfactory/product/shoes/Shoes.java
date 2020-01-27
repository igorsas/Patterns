package com.igor.creational.abstractfactory.product.shoes;

import com.igor.creational.abstractfactory.model.Size;

public abstract class Shoes {
    protected Size size;

    public Shoes(Size size) {
        this.size = size;
    }

    public abstract void tellBrand();
}
