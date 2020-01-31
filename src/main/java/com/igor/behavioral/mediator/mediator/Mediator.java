package com.igor.behavioral.mediator.mediator;

import com.igor.behavioral.mediator.component.Component;
import com.igor.behavioral.mediator.model.Move;

public interface Mediator {
    void obey(Component component, Move move);
}
