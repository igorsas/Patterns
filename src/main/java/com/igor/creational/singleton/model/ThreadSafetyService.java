package com.igor.creational.singleton.model;

import java.util.Objects;

public class ThreadSafetyService {
    private static volatile ThreadSafetyService service;
    private String endpoint;

    private ThreadSafetyService(String endpoint) {
        this.endpoint = endpoint;
    }

    public static ThreadSafetyService getInstance() {
        ThreadSafetyService localService = service;
        if (Objects.isNull(localService)) {
            synchronized (ThreadSafetyService.class) {
                localService = service;
                if (Objects.isNull(localService)) {
                    service = localService = new ThreadSafetyService("sofia/waiting");
                }
            }
        }
        return localService;
    }

}
