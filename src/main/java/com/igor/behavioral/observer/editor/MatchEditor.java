package com.igor.behavioral.observer.editor;

import com.igor.behavioral.observer.manager.MatchManager;
import com.igor.behavioral.observer.model.Event;
import com.igor.behavioral.observer.model.Match;


public class MatchEditor {
    private MatchManager matchManager;

    public MatchEditor() {
        this.matchManager = new MatchManager();
    }

    public void setMatchManager(MatchManager matchManager) {
        this.matchManager = matchManager;
    }

    public void goal(Match match, String teamName){
        match.goal(teamName);
        matchManager.notifySubscribers(Event.GOAL, match);
    }

    public void finishGame(Match match){
        match.finishGame();
        matchManager.notifySubscribers(Event.FINISHED, match);
    }
}
