package behavioral.command.example.two.command.impl;

import behavioral.command.example.two.command.Command;
import behavioral.command.example.two.receiver.Curtains;

public class DrawCurtainsCommand implements Command {
    private final Curtains curtains;

    public DrawCurtainsCommand(Curtains curtains) {
        this.curtains = curtains;
    }

    @Override
    public void execute() {
        curtains.drawCurtains();
    }
}
