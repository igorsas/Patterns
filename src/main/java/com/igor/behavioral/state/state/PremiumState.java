package com.igor.behavioral.state.state;

import com.igor.behavioral.state.model.Game;
import com.igor.behavioral.state.model.Playstation;

public class PremiumState extends State {
    public PremiumState(Playstation playstation) {
        super(playstation);
    }

    @Override
    public void findFriends() {
        System.out.println("Searching friends");
    }

    @Override
    public void buyPoints(int amount) {
        System.out.println("You've bought " + amount + " points with 80% sale.");
    }

    @Override
    public void playGame(Game game) {
        System.out.println("Enjoy your game");
    }
}
