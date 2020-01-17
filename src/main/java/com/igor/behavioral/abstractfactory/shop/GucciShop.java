package com.igor.behavioral.abstractfactory.shop;

import com.igor.behavioral.abstractfactory.model.Size;
import com.igor.behavioral.abstractfactory.product.jeans.GucciJeans;
import com.igor.behavioral.abstractfactory.product.jeans.Jeans;
import com.igor.behavioral.abstractfactory.product.shirt.GucciShirt;
import com.igor.behavioral.abstractfactory.product.shirt.Shirt;
import com.igor.behavioral.abstractfactory.product.shoes.GucciShoes;
import com.igor.behavioral.abstractfactory.product.shoes.Shoes;

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
