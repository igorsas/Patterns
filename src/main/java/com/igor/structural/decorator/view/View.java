package com.igor.structural.decorator.view;

import com.igor.structural.decorator.decorator.StuffWithCompanyNameDecorator;
import com.igor.structural.decorator.decorator.StuffWithCompanySloganDecorator;
import com.igor.structural.decorator.model.Color;
import com.igor.structural.decorator.model.CompanyStuff;
import com.igor.structural.decorator.model.Cup;
import com.igor.structural.decorator.model.Umbrella;

import java.util.Scanner;

public class View {
    public static void view() {
        CompanyStuff companyStuff = getCompanyStuff();
        companyStuff.view();
        System.out.println();

        companyStuff = new StuffWithCompanyNameDecorator(companyStuff, "EPAM");
        companyStuff.view();
        System.out.println();

        companyStuff = new StuffWithCompanySloganDecorator(companyStuff, "ACT AS A TEAM");
        companyStuff.view();
        System.out.println();
    }

    private static CompanyStuff getCompanyStuff() {
        Color color = getColor();
        return getCompanyStuff(color);
    }

    private static CompanyStuff getCompanyStuff(Color color) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product type:\n" +
                "1 - Cup\n" +
                "2 - Umbrella\n");

        int productTypeId = scanner.nextInt();
        CompanyStuff product;
        switch (productTypeId) {
            case 1:
                return new Cup(color);
            case 2:
                return new Umbrella(color);
            default:
                throw new IllegalArgumentException("\n\n--- This product doesn't exist yet ---\n\n");
        }
    }

    private static Color getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product color:\n" +
                "1 - WHITE\n" +
                "2 - BLACK\n" +
                "3 - BLUE\n");
        int colorId = scanner.nextInt();
        switch (colorId) {
            case 1:
                return Color.WHITE;
            case 2:
                return Color.BLACK;
            case 3:
                return Color.BLUE;
            default:
                throw new IllegalArgumentException("\n\n--- This color doesn't supported yet ---\n\n");
        }
    }
}
