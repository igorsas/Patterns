package com.igor.behavioral.mediator.component;

import com.igor.behavioral.mediator.mediator.Mediator;
import com.igor.behavioral.mediator.model.Move;

import java.util.Objects;

public abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void go(Move move);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(mediator, component.mediator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator);
    }
}
