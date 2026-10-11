package behavioral.memento.exercise;

import behavioral.memento.exercise.model.MSWord;

public class User {
    static void main(String[] args) {
        var editor = new MSWord();
        editor.write("Hello");
        editor.updateFont("Arial");
        editor.decrementFont();
        editor.decrementFont();
        editor.decrementFont();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.redo();
        editor.decrementFont();
        editor.decrementFont();
        editor.incrementFont();
        editor.write("Hello Wordl");
        editor.undo();
        editor.write("Hello World");
        editor.updateFont("Comic Sans MS");
        editor.decrementFont();
        editor.undo();
        editor.undo();
        System.out.println(editor.getCurrentState());

    }
}
