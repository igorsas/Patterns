package com.igor.creational.abstractfactory.product.shoes;

import com.igor.creational.abstractfactory.model.Size;

public class LouisVuittonShoes extends Shoes {
    public LouisVuittonShoes(Size size) {
        super(size);
    }

    @Override
    public void tellBrand() {
        System.out.println("It's Louis Vuitton shoes");
    }
}
