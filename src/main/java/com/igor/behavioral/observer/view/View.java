package com.igor.behavioral.observer.view;

import com.igor.behavioral.observer.editor.MatchEditor;
import com.igor.behavioral.observer.listener.FinishGameListener;
import com.igor.behavioral.observer.listener.GoalListener;
import com.igor.behavioral.observer.listener.Listener;
import com.igor.behavioral.observer.manager.MatchManager;
import com.igor.behavioral.observer.model.Match;
import com.igor.behavioral.observer.subscriber.Subscriber;

public class View {
    public static void view() {
        Match elClassico = new Match("Barcelona", "Real Madrid");
        Match ukrainianElClassico = new Match("Shachtar", "Dynamo");

        Subscriber detailLover = new Subscriber("Pedro", 40);
        Subscriber bookmeker = new Subscriber("Vasyl", 33);

        Listener goalListener = new GoalListener(detailLover);
        Listener finishGameListener = new FinishGameListener(bookmeker);

        System.out.println("Subscribe " + detailLover + " for goal listener for all matches");
        goalListener.addMatch(elClassico)
                .addMatch(ukrainianElClassico);

        System.out.println("Subscribe " + bookmeker + " for finish game listener for all matches");
        finishGameListener.addMatch(elClassico)
                .addMatch(ukrainianElClassico);

        MatchManager matchManager = new MatchManager();
        matchManager.subscribe(goalListener);
        matchManager.subscribe(finishGameListener);

        MatchEditor editor = new MatchEditor();
        editor.setMatchManager(matchManager);

        editor.goal(elClassico, "Barcelona");
        editor.finishGame(ukrainianElClassico);

        System.out.println("Unsubscribe " + detailLover + " for finish game listener for all matches");
        matchManager.unsubscribe(finishGameListener);

        editor.finishGame(elClassico);
    }
}
