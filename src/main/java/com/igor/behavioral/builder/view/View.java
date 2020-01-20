package com.igor.behavioral.builder.view;


import com.igor.behavioral.builder.builder.BenderBuilder;
import com.igor.behavioral.builder.builder.LionTurtle;
import com.igor.behavioral.builder.model.Bender;
import com.igor.behavioral.builder.model.Bending;
import com.igor.behavioral.builder.model.Nation;

import java.util.*;

public class View {
    public static BenderBuilder benderBuilder;

    public static void view() {
        List<Bending> avatarBendings = Arrays.asList(Bending.AIRBENDING, Bending.EARTHBENDING, Bending.FIREBENDING, Bending.WATERBENDING);

        BenderBuilder benderBuilder = getBenderBuilder();
        LionTurtle lionTurtle = new LionTurtle();
        lionTurtle.createBender(benderBuilder, avatarBendings);
        Bender avatar = benderBuilder.build();
        System.out.println("Avatar bender: " + avatar);
        System.out.println("IsAvatar method: " + avatar.isAvatar());
        System.out.println("isBender method: " + avatar.isBender());

        benderBuilder = getBenderBuilder();
        lionTurtle.createBender(benderBuilder, Collections.singletonList(Bending.WATERBENDING));
        Bender waterBender = benderBuilder.build();

        System.out.println("Waterbender: " + waterBender);
        System.out.println("IsAvatar method: " + waterBender.isAvatar());
        System.out.println("isBender method: " + waterBender.isBender());
    }

    private static BenderBuilder getBenderBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter bender's name:\n");
        String benderName = scanner.nextLine();
        System.out.println("\n\nPlease tell me it's nation:\n" +
                "1 - Fire\n" +
                "2 - Water\n" +
                "3 - Air\n" +
                "4 - Earth\n" +
                "5 - Republic City\n");
        int nationId = scanner.nextInt();
        Nation nation = getNation(nationId);

        return Objects.isNull(benderBuilder) ? new BenderBuilder(nation, benderName) : benderBuilder.refresh(nation, benderName);
    }

    private static Nation getNation(int nationId) {
        switch (nationId) {
            case 1:
                return Nation.FIRE;
            case 2:
                return Nation.WATER;
            case 3:
                return Nation.AIR;
            case 4:
                return Nation.EARTH;
            case 5:
                return Nation.REPUBLIC_CITY;
            default:
                throw new IllegalArgumentException("\n\n--- This nation doesn't exist yet ---\n\n");
        }
    }
}
