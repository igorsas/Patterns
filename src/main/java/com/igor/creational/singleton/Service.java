package com.igor.creational.singleton;

import java.util.Objects;

//це тіп сінглтон)
public class Service {
    private static Service service;
    private String endpoint;

    private Service(String endpoint){
        this.endpoint = endpoint;
    }

    public static Service getInstance(){
        if(Objects.isNull(service)){
            return new Service("sofia/waiting");
        }
        return service;
    }

    public static void main(String[] args) {
        getInstance();
    }
}
