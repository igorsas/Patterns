package com.igor.structural.composite.view;

import com.igor.structural.composite.model.Device;
import com.igor.structural.composite.model.Processor;
import com.igor.structural.composite.model.RAM;
import com.igor.structural.composite.model.Screen;

public class View {
    public static void view() {
        Processor processor = new Processor();
        processor.turnOn();
        RAM ram = new RAM();
        ram.turnOn();
        Screen screen = new Screen();
        screen.turnOn();

        Device monitor = new Device();
        monitor.addDetail(screen);

        Device computer = new Device();
        computer.addDetail(processor);
        computer.addDetail(ram);
        computer.addDetail(monitor);

        System.out.println("Computer is on: " + computer.isOn());
    }
}
