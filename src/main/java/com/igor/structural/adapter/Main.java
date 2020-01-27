package com.igor.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();

        SSDPCI ssdpci = new SSDPCI();
        SSDmSATA ssDmSATA = new SSDmSATA();
        SSDmSATAAdapter ssDmSATAAdapter = new SSDmSATAAdapter(ssDmSATA);

        motherboard.putSSD(ssdpci);
        motherboard.putSSD(ssDmSATAAdapter);
    }
}
