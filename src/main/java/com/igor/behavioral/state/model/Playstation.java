package com.igor.behavioral.state.model;

import com.igor.behavioral.state.state.NotAuthorizedState;
import com.igor.behavioral.state.state.State;

public class Playstation {
    State state;

    public Playstation() {
        this.state = new NotAuthorizedState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public void findFriends() {
        state.findFriends();
    }

    public void buyPoints(int amount) {
        state.buyPoints(amount);
    }

    public void playGame(Game game) {
        state.playGame(game);
    }
}
