package behavioral.state.exercise.state.impl;

import behavioral.state.exercise.state.TravelState;

public class BicyclingState implements TravelState {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 20;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 1;
    }
}
