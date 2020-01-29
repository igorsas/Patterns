package com.igor.structural.proxy.dao;

import com.igor.structural.proxy.dao.DatabaseService;
import com.igor.structural.proxy.dao.MSDatabase;

import java.util.Objects;

public class DatabaseProxy extends DatabaseService {
    private DatabaseService databaseService;

    @Override
    public void executeQuery(String query) {
        System.out.println("Method executeQuery is running in class DatabaseProxy");
        if (Objects.isNull(databaseService))
            databaseService = new MSDatabase();
        databaseService.executeQuery(query);
    }

    @Override
    public void openSession() {
        System.out.println("Method openSession is running in class DatabaseProxy");
        if (Objects.isNull(databaseService))
            databaseService = new MSDatabase();
        databaseService.openSession();
    }
}
