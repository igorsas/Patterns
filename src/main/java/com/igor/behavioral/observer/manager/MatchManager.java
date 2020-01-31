package com.igor.behavioral.observer.manager;

import com.igor.behavioral.observer.listener.Listener;
import com.igor.behavioral.observer.model.Event;
import com.igor.behavioral.observer.model.Match;
import com.igor.behavioral.observer.subscriber.Subscriber;

import java.util.*;

public class MatchManager {
    private Map<Subscriber, Set<Listener>> listeners;

    public MatchManager() {
        this.listeners = new HashMap<>();
    }

    public void subscribe(Listener listener) {
        Subscriber subscriber = listener.getSubscriber();
        Set<Listener> l = listeners.get(subscriber);
        if (Objects.isNull(l)) {
            l = new HashSet<>();
        }
        l.add(listener);
        listeners.put(subscriber, l);
    }

    public void unsubscribe(Listener listener) {
        Subscriber subscriber = listener.getSubscriber();
        Set<Listener> l = listeners.get(subscriber);
        if (Objects.nonNull(l) && l.contains(listener)) {
            l.remove(listener);
            if (l.isEmpty()) {
                listeners.remove(subscriber);
            }
        }
    }

    public void notifySubscribers(Event event, Match match) {
        for (Subscriber user : listeners.keySet()) {
            if (Objects.nonNull(user)) {
                for (Listener newsListener : listeners.get(user)) {
                    if (Objects.nonNull(newsListener)) {
                        newsListener.update(event, match);
                    }
                }
            }
        }
    }
}
