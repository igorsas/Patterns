package com.igor.behavioral.abstractfactory.shop;

import com.igor.behavioral.abstractfactory.model.Size;
import com.igor.behavioral.abstractfactory.product.jeans.Jeans;
import com.igor.behavioral.abstractfactory.product.shirt.Shirt;
import com.igor.behavioral.abstractfactory.product.shoes.Shoes;

public abstract class Shop {
    public abstract void tellBrand();

    public abstract Jeans buyJeans(Size size);

    public abstract Shirt buyShirt(Size size);

    public abstract Shoes buyShoes(Size size);
}
