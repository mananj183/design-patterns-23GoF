package behavioral.memento.exercise.model;

public class MSWord {

    private final TextArea textArea = new TextArea();
    private final History history = new History(textArea);

    public MSWord() {
        // push an empty snapshot to initialize the history stack
        history.push(textArea.createSnapshot());
    }

    public void write(String text) {
        textArea.setContent(text);
        history.push(textArea.createSnapshot());
    }

    public void updateFont(String newFont) {
        textArea.setFontName(newFont);
        history.push(textArea.createSnapshot());
    }

    public void incrementFont() {
        textArea.setFontSize(textArea.getFontSize() + 2);
        history.push(textArea.createSnapshot());
    }

    public void decrementFont() {
        textArea.setFontSize(textArea.getFontSize() - 2);
        history.push(textArea.createSnapshot());
    }

    public void undo() {
        history.undo();
    }

    public void redo() {
        history.redo();
    }

    public String getCurrentState(){
        return textArea.getContent() + " in font name: " + textArea.getFontName() + " and font size: " + textArea.getFontSize();
    }
}
