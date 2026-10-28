package behavioral.command.example.two.receiver;

public class Curtains {
    private boolean isCurtainsDrawn = true;

    public void drawCurtains() {
        this.isCurtainsDrawn = true;
        System.out.println("Curtains are drawn");
    }

    // to implement the undo action of drawing the curtains we need to use the Undo feature of command pattern
    // Below method is added to show that our receiver class cannot have a separate method to perform the undo operation
    public void undrawCurtains() {
        this.isCurtainsDrawn = false;
        System.out.println("Curtains are withdrawn");
    }
}
