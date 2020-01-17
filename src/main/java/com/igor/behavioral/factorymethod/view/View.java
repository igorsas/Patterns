package com.igor.behavioral.factorymethod.view;

import com.igor.behavioral.factorymethod.office.Office;
import com.igor.behavioral.factorymethod.office.SalesOffice;
import com.igor.behavioral.factorymethod.office.SecurityOffice;

import java.util.Scanner;

public class View {
    public static void view() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose department(true for Security, false for Marketing)");
        boolean isSecurityDepartment = scanner.nextBoolean();
        Office office;
        if (isSecurityDepartment) {
            office = new SecurityOffice("West");
        } else {
            office = new SalesOffice("South");
        }
        office.createDepartment();
        office.showDepartment();
    }
}
