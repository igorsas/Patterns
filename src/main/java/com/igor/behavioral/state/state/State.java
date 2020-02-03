package com.igor.behavioral.state.state;

import com.igor.behavioral.state.model.Game;
import com.igor.behavioral.state.model.Playstation;

public abstract class State {
    protected Playstation playstation;

    public State(Playstation playstation) {
        this.playstation = playstation;
    }

    public abstract void findFriends();
    public abstract void buyPoints(int amount);
    public abstract void playGame(Game game);
}
