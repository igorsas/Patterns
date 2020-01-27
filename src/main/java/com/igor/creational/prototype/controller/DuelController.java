package com.igor.creational.prototype.controller;

import com.igor.creational.prototype.model.Bowman;
import com.igor.creational.prototype.model.Defender;
import com.igor.creational.prototype.model.Team;
import com.igor.creational.prototype.model.Warrior;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DuelController {
    public static List<Warrior> createTeam(int amountBowman, int amountDefender) {
        Bowman bowman = new Bowman(50, 25);
        Defender defender = new Defender(75, 15);

        List<Warrior> originalWarriors = Arrays.asList(bowman, defender);
        List<Warrior> warriors = new LinkedList<>();
        for (; amountBowman + amountDefender != 0; ) {
            Warrior clone;
            if (amountBowman != 0 && amountDefender != 0) {
                int warriorType = new Random().nextInt(2);
                clone = originalWarriors.get(warriorType).clone();
                warriors.add(clone);
                if (warriorType == 0) {
                    amountBowman--;
                } else {
                    amountDefender--;
                }
            } else if (amountBowman != 0) {
                warriors.add(bowman.clone());
                amountBowman--;
            } else {
                warriors.add(defender.clone());
                amountDefender--;
            }
        }

        return warriors;
    }


    public static boolean fight(Team firstTeam, Team secondTeam) {
        List<Warrior> firstWarriors = firstTeam.getWarriors();
        List<Warrior> secondWarriors = secondTeam.getWarriors();
        boolean haveWinner = false;

        int size = Math.max(firstWarriors.size(), secondWarriors.size());
        for (int i = 0; i < size; i++, size = Math.max(firstWarriors.size(), secondWarriors.size())) {
            if (firstWarriors.size() == 0 || secondWarriors.size() == 0) {
                System.out.println("We have a winner");
                haveWinner = true;
                break;
            }

            if (i >= firstWarriors.size()) {
                Warrior firstWarrior = firstWarriors.get(firstWarriors.size() - 1);
                secondWarriors.get(i).attack(firstWarrior);
                if (!firstWarrior.isAlive()) {
                    firstWarriors.remove(firstWarrior);
                    i--;
                }
            } else if (i >= secondWarriors.size()) {
                Warrior secondWarrior = secondWarriors.get(secondWarriors.size() - 1);
                firstWarriors.get(i).attack(secondWarrior);
                if (!secondWarrior.isAlive()) {
                    secondWarriors.remove(secondWarrior);
                    i--;
                }
            } else {
                Warrior firstWarrior = firstWarriors.get(i);
                Warrior secondWarrior = secondWarriors.get(i);
                boolean whoAttackFirst = new Random().nextBoolean();

                if (whoAttackFirst) {
                    i -= attack(firstWarriors, secondWarriors, firstWarrior, secondWarrior) ? 1 : 0;
                } else {
                    i -= attack(secondWarriors, firstWarriors, secondWarrior, firstWarrior) ? 1 : 0;
                }
            }

        }
        return haveWinner;
    }

    private static boolean attack(List<Warrior> firstTeam, List<Warrior> secondTeam, Warrior firstWarrior, Warrior secondWarrior) {
        firstWarrior.attack(secondWarrior);
        if (!secondWarrior.isAlive()) {
            secondTeam.remove(secondWarrior);
            return true;
        }
        secondWarrior.attack(firstWarrior);
        if (!firstWarrior.isAlive()) {
            firstTeam.remove(firstWarrior);
            return true;
        }
        return false;
    }
}
