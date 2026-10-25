package behavioral.state.exercise.state.impl;

import behavioral.state.exercise.state.TravelState;

public class DrivingState implements TravelState {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
