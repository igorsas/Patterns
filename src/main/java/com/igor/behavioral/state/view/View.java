package com.igor.behavioral.state.view;

import com.igor.behavioral.state.model.Game;
import com.igor.behavioral.state.model.Playstation;
import com.igor.behavioral.state.state.AuthorizedState;
import com.igor.behavioral.state.state.PremiumState;

public class View {
    private static Game fifa20;
    private static Game fortnite;

    public static void view() {
        fifa20 = new Game(false, "Fifa 20");
        fortnite = new Game(true, "Fortnite");

        Playstation playstation = new Playstation();
        callMethods(playstation);

        System.out.println("\nAuthorize in system");
        playstation.changeState(new AuthorizedState(playstation));
        callMethods(playstation);
        System.out.println("\nBuy premium account");
        playstation.changeState(new PremiumState(playstation));
        callMethods(playstation);
    }

    private static void callMethods(Playstation playstation){
        playGame(playstation, fifa20);
        playGame(playstation, fortnite);
        findFriends(playstation);
        buy5Points(playstation);
    }

    private static void buy5Points(Playstation playstation){
        System.out.println("Buying 5 points: ");
        playstation.buyPoints(5);
    }

    private static void findFriends(Playstation playstation){
        System.out.println("Finding friends: ");
        playstation.findFriends();
    }

    private static void playGame(Playstation playstation, Game game){
        System.out.println("Play " + game.getName() + ":");
        playstation.playGame(game);
    }
}
