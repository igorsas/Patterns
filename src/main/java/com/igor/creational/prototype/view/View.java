package com.igor.creational.prototype.view;

import com.igor.creational.prototype.model.Team;

import java.util.Scanner;

import static com.igor.creational.prototype.controller.DuelController.createTeam;
import static com.igor.creational.prototype.controller.DuelController.fight;

public class View {
    public static void view() {
        Team firstTeam = getTeam();
        Team secondTeam = getTeam();

        boolean battleResult = false;

        while (!battleResult) {
            battleResult = fight(firstTeam, secondTeam);
        }

        System.out.println("Winner's is " + (firstTeam.hasWarriors() ? firstTeam.getName() : secondTeam.getName()));
    }

    private static Team getTeam() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter team name:");
        String firstTeamName = scanner.nextLine();
        System.out.println("Enter amount bowman in team " + firstTeamName + ": ");
        int amountBowman = scanner.nextInt();
        System.out.println("Enter amount defender in team " + firstTeamName + ": ");
        int amountDefender = scanner.nextInt();

        return new Team(createTeam(amountBowman, amountDefender), firstTeamName);
    }
}
