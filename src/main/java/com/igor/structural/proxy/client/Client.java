package com.igor.structural.proxy.client;

import com.igor.structural.proxy.dao.DatabaseProxy;
import com.igor.structural.proxy.dao.DatabaseService;

public class Client {
    public void createTable(String tableName, String... columns){
        DatabaseService databaseService = new DatabaseProxy();
        databaseService.openSession();
        String createTableQuery = getCreateTableQuery(tableName, columns);
        databaseService.executeQuery(createTableQuery);
    }

    private String getCreateTableQuery(String tableName, String... columns) {
        StringBuilder query = new StringBuilder("CREATE TABLE " + tableName + "(\nid INT PRIMARY KEY");
        for (String column: columns) {
            query.append(",\n").append(column).append(" VARCHAR (50) NOT NULL");
        }
        query.append(");");
        return query.toString();
    }
}
