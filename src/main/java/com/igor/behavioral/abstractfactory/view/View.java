package com.igor.behavioral.abstractfactory.view;

import com.igor.behavioral.abstractfactory.model.Size;
import com.igor.behavioral.abstractfactory.product.jeans.Jeans;
import com.igor.behavioral.abstractfactory.product.shirt.Shirt;
import com.igor.behavioral.abstractfactory.product.shoes.Shoes;
import com.igor.behavioral.abstractfactory.shop.GucciShop;
import com.igor.behavioral.abstractfactory.shop.LouisVuittonShop;
import com.igor.behavioral.abstractfactory.shop.Shop;

import java.util.Scanner;

public class View {
    public static void view() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose brand:\n" +
                "1 - Gucci\n" +
                "2 - Louis Vuitton\n");
        int brand = scanner.nextInt();
        Shop shop;
        shop = getShoupByBrand(brand);
        System.out.println("\n\nPlease tell me your size:\n" +
                "1 - S\n" +
                "2 - M\n" +
                "3 - L\n" +
                "4 - XL\n" +
                "5 - XXL\n");
        int size = scanner.nextInt();
        Jeans jeans = getJeans(shop, size);
        Shirt shirt = getShirt(shop, size);
        Shoes shoes = getShoes(shop, size);

        System.out.print("Your shop brand: ");
        shop.tellBrand();

        System.out.println("Your goods: ");
        System.out.print("Your jeans brand: ");
        jeans.tellBrand();
        System.out.print("Your shirt brand: ");
        shirt.tellBrand();
        System.out.print("Your shoes brand: ");
        shoes.tellBrand();
    }

    private static Jeans getJeans(Shop shop, int size) {
        switch (size) {
            case 1:
                return shop.buyJeans(Size.S);
            case 2:
                return shop.buyJeans(Size.M);
            case 3:
                return shop.buyJeans(Size.L);
            case 4:
                return shop.buyJeans(Size.XL);
            case 5:
                return shop.buyJeans(Size.XXL);
            default:
                throw new IllegalArgumentException("\n\n--- We don't have your size ---\n\n");
        }
    }

    private static Shoes getShoes(Shop shop, int size) {
        switch (size) {
            case 1:
                return shop.buyShoes(Size.S);
            case 2:
                return shop.buyShoes(Size.M);
            case 3:
                return shop.buyShoes(Size.L);
            case 4:
                return shop.buyShoes(Size.XL);
            case 5:
                return shop.buyShoes(Size.XXL);
            default:
                throw new IllegalArgumentException("\n\n--- We don't have your size ---\n\n");
        }
    }

    private static Shirt getShirt(Shop shop, int size) {
        switch (size) {
            case 1:
                return shop.buyShirt(Size.S);
            case 2:
                return shop.buyShirt(Size.M);
            case 3:
                return shop.buyShirt(Size.L);
            case 4:
                return shop.buyShirt(Size.XL);
            case 5:
                return shop.buyShirt(Size.XXL);
            default:
                throw new IllegalArgumentException("\n\n--- We don't have your size ---\n\n");
        }
    }

    private static Shop getShoupByBrand(int brand) {
        if (brand == 1) {
            return new GucciShop();
        } else if (brand == 2) {
            return new LouisVuittonShop();
        } else {
            throw new IllegalArgumentException("\n\n--- Our shop doesn't cooropate with your brand ---\n\n");
        }
    }
}
