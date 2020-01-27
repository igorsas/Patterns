package com.igor.structural.bridge.view;

import com.igor.structural.bridge.controller.AdvancedController;
import com.igor.structural.bridge.controller.Controller;
import com.igor.structural.bridge.hoover.Hoover;
import com.igor.structural.bridge.hoover.SmartHoover;
import com.igor.structural.bridge.hoover.SovietHoover;

public class View {
    public static void view() {
        Hoover sovietHoover = new SovietHoover();
        Hoover smartHoover = new SmartHoover();

        Controller controller = new Controller(sovietHoover);
        AdvancedController advancedController = new AdvancedController(smartHoover);

        controller.togglePower();
        advancedController.togglePower();
        advancedController.changeBag();
        advancedController.powerUp();
        advancedController.powerUp();
    }
}
