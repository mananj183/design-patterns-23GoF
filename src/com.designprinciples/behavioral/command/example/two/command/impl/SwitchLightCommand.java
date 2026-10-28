package behavioral.command.example.two.command.impl;

import behavioral.command.example.two.command.Command;
import behavioral.command.example.two.receiver.Light;

public class SwitchLightCommand implements Command {
    private final Light light;

    public SwitchLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
