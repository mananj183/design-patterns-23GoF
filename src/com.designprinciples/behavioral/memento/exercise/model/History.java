package behavioral.memento.exercise.model;

import java.util.ArrayDeque;
import java.util.Deque;

class History {
    private final TextArea textArea;
    private final Deque<TextArea.Memento> undoStack = new ArrayDeque<>();
    private final Deque<TextArea.Memento> redoStack = new ArrayDeque<>();

    History(TextArea textArea) {
        this.textArea = textArea;
    }

    protected void push(TextArea.Memento snapshot) {
        undoStack.push(snapshot);
    }

    protected void undo() {
        if (undoStack.size() <= 1) {
            return;
        }
        redoStack.push(undoStack.pop());
        if (!undoStack.isEmpty()){
            textArea.restore(undoStack.peek());
        }
    }

    protected void redo() {
        if (redoStack.isEmpty()){
            return;
        }
        final TextArea.Memento top =  redoStack.peek();
        undoStack.push(top);
        textArea.restore(undoStack.pop());
    }
}
