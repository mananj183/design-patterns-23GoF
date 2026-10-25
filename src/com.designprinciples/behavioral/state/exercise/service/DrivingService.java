package behavioral.state.exercise.service;

import behavioral.state.exercise.state.TravelState;

public class DrivingService {
    private final TravelState travelState;

    public DrivingService(TravelState travelState) {
        this.travelState = travelState;
    }

    public int getEta() {
        return travelState.getEta();
    }

    public int getDirection() {
        return travelState.getDirection();
    }
}
