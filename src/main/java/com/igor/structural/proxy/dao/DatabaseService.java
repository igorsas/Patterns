package com.igor.structural.proxy.dao;

public abstract class DatabaseService {
    protected boolean isSessionOpened;

    public abstract void executeQuery(String query);
    public abstract void openSession();
}
