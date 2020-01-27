package com.igor.creational.abstractfactory.shop;

import com.igor.creational.abstractfactory.model.Size;
import com.igor.creational.abstractfactory.product.jeans.Jeans;
import com.igor.creational.abstractfactory.product.shirt.Shirt;
import com.igor.creational.abstractfactory.product.shoes.Shoes;

public abstract class Shop {
    public abstract void tellBrand();

    public abstract Jeans buyJeans(Size size);

    public abstract Shirt buyShirt(Size size);

    public abstract Shoes buyShoes(Size size);
}
