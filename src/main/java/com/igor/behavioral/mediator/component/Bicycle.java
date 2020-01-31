package com.igor.behavioral.mediator.component;

import com.igor.behavioral.mediator.mediator.Mediator;
import com.igor.behavioral.mediator.model.Move;

public class Bicycle extends Component {

    public Bicycle(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void go(Move move) {
        mediator.obey(this, move);
    }
}
