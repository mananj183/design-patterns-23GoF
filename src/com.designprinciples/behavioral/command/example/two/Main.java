package behavioral.command.example.two;

import behavioral.command.example.two.command.impl.DrawCurtainsCommand;
import behavioral.command.example.two.command.impl.SwitchLightCommand;
import behavioral.command.example.two.receiver.Curtains;
import behavioral.command.example.two.receiver.Light;
import behavioral.command.example.two.invoker.Room;

public class Main {
    static void main(String[] args) {
        Room livingRoom = new Room();
        Light sideLamp = new Light();
        livingRoom.setCommand(new SwitchLightCommand(sideLamp));
        livingRoom.executeCommand();
        livingRoom.setCommand(new DrawCurtainsCommand(new Curtains()));
        livingRoom.executeCommand();
        livingRoom.setCommand(new SwitchLightCommand(sideLamp));
        livingRoom.executeCommand();
    }
}
