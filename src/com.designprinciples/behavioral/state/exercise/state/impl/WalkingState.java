package behavioral.state.exercise.state.impl;

import behavioral.state.exercise.state.TravelState;

public class WalkingState implements TravelState {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Walking)");
        return 45;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Walking)");
        return 1;
    }
}
