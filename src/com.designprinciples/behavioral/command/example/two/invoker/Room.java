package behavioral.command.example.two.invoker;

import behavioral.command.example.two.command.Command;

public class Room {
    private Command command;

    public Room() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
