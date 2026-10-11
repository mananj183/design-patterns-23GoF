package behavioral.state.example.one;

public class Eraser implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Eraser tool selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erasing items");
    }
}
