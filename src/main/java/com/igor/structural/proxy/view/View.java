package com.igor.structural.proxy.view;

import com.igor.structural.proxy.client.Client;

public class View {
    public static void view() {
        new Client().createTable("Plane", "seat", "bag", "passengers");
    }
}
