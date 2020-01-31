package com.igor.behavioral.observer.listener;

import com.igor.behavioral.observer.model.Event;
import com.igor.behavioral.observer.model.Match;
import com.igor.behavioral.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public abstract class Listener {
    protected Subscriber subscriber;
    protected List<Match> matches;

    public Listener(Subscriber subscriber) {
        this.subscriber = subscriber;
        this.matches = new ArrayList<>();
    }

    public Listener addMatch(Match match) {
        matches.add(match);
        return this;
    }

    public abstract void update(Event event, Match match);

    public Subscriber getSubscriber() {
        return subscriber;
    }
}
