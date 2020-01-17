package com.igor.behavioral.abstractfactory.shop;

import com.igor.behavioral.abstractfactory.model.Size;
import com.igor.behavioral.abstractfactory.product.jeans.Jeans;
import com.igor.behavioral.abstractfactory.product.jeans.LouisVuittonJeans;
import com.igor.behavioral.abstractfactory.product.shirt.LouisVuittonShirt;
import com.igor.behavioral.abstractfactory.product.shirt.Shirt;
import com.igor.behavioral.abstractfactory.product.shoes.LouisVuittonShoes;
import com.igor.behavioral.abstractfactory.product.shoes.Shoes;

public class LouisVuittonShop extends Shop {
    @Override
    public void tellBrand() {
        System.out.println("It's Louis Vuitton");
    }

    @Override
    public Jeans buyJeans(Size size) {
        return new LouisVuittonJeans(size);
    }

    @Override
    public Shirt buyShirt(Size size) {
        return new LouisVuittonShirt(size);
    }

    @Override
    public Shoes buyShoes(Size size) {
        return new LouisVuittonShoes(size);
    }
}
