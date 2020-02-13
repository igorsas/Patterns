package com.igor.creational.singleton.model;

import java.util.Objects;

//це тіп сінглтон)
public class SimpleService {
    private static SimpleService service;
    private String endpoint;

    private SimpleService(String endpoint){
        this.endpoint = endpoint;
    }

    public static SimpleService getInstance(){
        if(Objects.isNull(service)){
            service = new SimpleService("sofia/waiting");
        }
        return service;
    }
}
