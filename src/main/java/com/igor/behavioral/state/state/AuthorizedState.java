package com.igor.behavioral.state.state;

import com.igor.behavioral.state.model.Game;
import com.igor.behavioral.state.model.Playstation;

public class AuthorizedState extends State {
    public AuthorizedState(Playstation playstation) {
        super(playstation);
    }

    @Override
    public void findFriends() {
        System.out.println("Searching friends");
    }

    @Override
    public void buyPoints(int amount) {
        System.out.println("You've bought " + amount + " points");
    }

    @Override
    public void playGame(Game game) {
        if (game.isFree()) {
            System.out.println("Enjoy your game");
        } else {
            System.out.println("Please buy this game or buy Premium account");
        }
    }
}
