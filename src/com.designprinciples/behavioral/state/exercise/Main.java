package behavioral.state.exercise;

import behavioral.state.exercise.service.DrivingService;
import behavioral.state.exercise.state.impl.DrivingState;

public class Main {
    static void main(String[] args) {
        var service = new DrivingService(new DrivingState());
        System.out.println(service.getEta());
    }
}
