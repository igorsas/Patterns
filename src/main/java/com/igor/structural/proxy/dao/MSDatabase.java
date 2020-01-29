package com.igor.structural.proxy.dao;

public class MSDatabase extends DatabaseService {
    @Override
    public void executeQuery(String query) {
        if (isSessionOpened)
            System.out.println("Executing query: " + query);
        else
            System.out.println("Session is not opened.");
    }

    @Override
    public void openSession() {
        isSessionOpened = true;
    }
}
