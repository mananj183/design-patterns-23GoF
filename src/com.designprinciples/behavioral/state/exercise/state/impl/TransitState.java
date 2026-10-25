package behavioral.state.exercise.state.impl;

import behavioral.state.exercise.state.TravelState;

public class TransitState implements TravelState {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Transit)");
        return 1;
    }
}
