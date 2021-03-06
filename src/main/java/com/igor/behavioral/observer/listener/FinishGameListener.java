package com.igor.behavioral.observer.listener;

import com.igor.behavioral.observer.model.Event;
import com.igor.behavioral.observer.model.Match;
import com.igor.behavioral.observer.subscriber.Subscriber;

public class FinishGameListener extends Listener {
    private Event eventType;

    public FinishGameListener(Subscriber subscriber) {
        super(subscriber);
        eventType = Event.FINISHED;
    }

    @Override
    public void update(Event event, Match match) {
        if (event == eventType && matches.contains(match)) {
            subscriber.takeEvent(event, match);
        }
    }
}
