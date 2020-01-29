package com.igor.behavioral.cor.view;

import com.igor.behavioral.cor.model.Citizen;
import com.igor.behavioral.cor.model.Problem;
import com.igor.behavioral.cor.servant.CivilServant;
import com.igor.behavioral.cor.servant.Delegate;
import com.igor.behavioral.cor.servant.President;
import com.igor.behavioral.cor.servant.VillageCouncil;

import java.util.Scanner;

public class View {
    public static void view() {
        Citizen vasia = getCitizen();

        CivilServant civilServant = new VillageCouncil();
        civilServant.addMoreCompetent(new Delegate())
                .addMoreCompetent(new President());

        civilServant.resolveProblem(vasia.getProblem(), vasia.getDescriptor());
    }

    private static Citizen getCitizen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your problem type:\n" +
                "1 - Local\n" +
                "2 - Regional\n" +
                "3 - Global");

        int problemId = scanner.nextInt();
        Problem problem;
        switch (problemId) {
            case 1:
                problem = Problem.LOCAL;
                break;
            case 2:
                problem = Problem.REGIONAL;
                break;
            case 3:
                problem = Problem.GLOBAL;
                break;
            default:
                problem = Problem.UNKNOWN;
                break;
        }

        System.out.println("Please write description to your problem: ");
        scanner.nextLine();
        String description = scanner.nextLine();
        return new Citizen(name, problem, description);
    }
}
