package com.igor.creational.singleton;

import com.igor.creational.singleton.model.EnumService;
import com.igor.creational.singleton.model.SimpleService;
import com.igor.creational.singleton.model.ThreadSafetyService;

public class Main {
    public static void main(String[] args) {
        SimpleService.getInstance();
        ThreadSafetyService.getInstance();
        //create service which you want
        new EnumService.ServiceBuilder("sofia/waiting").build();
        //get from enum
        EnumService.getService();
    }
}
