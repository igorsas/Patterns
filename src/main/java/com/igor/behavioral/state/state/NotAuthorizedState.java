package com.igor.behavioral.state.state;

import com.igor.behavioral.state.model.Game;
import com.igor.behavioral.state.model.Playstation;

public class NotAuthorizedState extends State {
    public NotAuthorizedState(Playstation playstation) {
        super(playstation);
    }

    @Override
    public void findFriends() {
        askAuthorize();
    }

    @Override
    public void buyPoints(int amount) {
        askAuthorize();
    }

    @Override
    public void playGame(Game game) {
        if (game.isFree()) {
            System.out.println("Enjoy your game");
        } else {
            System.out.println("Please authorize and buy this game or Premium account");
        }
    }

    private void askAuthorize(){
        System.out.println("Please authorize, you're offline");
    }
}
