package com.igor.creational.abstractfactory.shop;

import com.igor.creational.abstractfactory.model.Size;
import com.igor.creational.abstractfactory.product.jeans.GucciJeans;
import com.igor.creational.abstractfactory.product.jeans.Jeans;
import com.igor.creational.abstractfactory.product.shirt.GucciShirt;
import com.igor.creational.abstractfactory.product.shirt.Shirt;
import com.igor.creational.abstractfactory.product.shoes.GucciShoes;
import com.igor.creational.abstractfactory.product.shoes.Shoes;

public class GucciShop extends Shop {
    @Override
    public void tellBrand() {
        System.out.println("It's Gucci");
    }

    @Override
    public Jeans buyJeans(Size size) {
        return new GucciJeans(size);
    }

    @Override
    public Shirt buyShirt(Size size) {
        return new GucciShirt(size);
    }

    @Override
    public Shoes buyShoes(Size size) {
        return new GucciShoes(size);
    }

}
