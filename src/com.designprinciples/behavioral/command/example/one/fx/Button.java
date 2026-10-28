package behavioral.command.example.one.fx;

import behavioral.command.example.one.command.Command;

public class Button {
    private String label;
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
