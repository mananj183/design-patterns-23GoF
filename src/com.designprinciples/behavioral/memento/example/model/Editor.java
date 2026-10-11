package behavioral.memento.example.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private static final int MAX_SNAPSHOTS = 5;
    private final TextArea textArea = new TextArea();
    private final Deque<TextArea.Memento> undoHistory = new ArrayDeque<>();
    private final Deque<TextArea.Memento> restoreHistory = new ArrayDeque<>();

    public Editor() {
        undoHistory.push(textArea.createSnapshot());
    }

    public void write(String text){
        textArea.setText(text);
        undoHistory.push(textArea.createSnapshot());
        restoreHistory.clear();
        if (undoHistory.size() > MAX_SNAPSHOTS) {
            undoHistory.removeLast();
        }
    }

    public void undo(){
        if (undoHistory.isEmpty()) {
            return;
        }
        // remove top element
        restoreHistory.push(undoHistory.pop());
        // restore to the top element from the remaining stack
        if(!undoHistory.isEmpty()) {
            textArea.restore(undoHistory.peek());
        }
    }

    public void redo(){
        if (restoreHistory.isEmpty()){
            return;
        }
        final TextArea.Memento top =  restoreHistory.peek();
        undoHistory.push(top);
        textArea.restore(restoreHistory.pop());
    }

    public String getText() {
        return textArea.getText();
    }

}
