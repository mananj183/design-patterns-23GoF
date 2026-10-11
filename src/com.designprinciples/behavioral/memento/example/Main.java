package behavioral.memento.example;

import behavioral.memento.example.model.Editor;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        show(editor, "start");
        editor.write("Like");                     show(editor, "write");
        editor.write("Like And");                 show(editor, "write");
        editor.write("Like And Subscribe");       show(editor, "write");
        editor.write("Like And Subscribe error"); show(editor, "write");
        editor.write("Like And Subscribe error 1"); show(editor, "write");
        editor.write("Like And Subscribe error 1 2"); show(editor, "write");
        editor.undo();                            show(editor, "undo");
        editor.undo();                            show(editor, "undo");
        editor.redo();
        editor.undo();                            show(editor, "undo");
        editor.undo();                            show(editor, "undo");
        editor.undo();                            show(editor, "undo");
        editor.undo();                            show(editor, "undo");
        editor.undo();                            show(editor, "undo");
    }

    private static void show(Editor editor, String action) {
        System.out.printf("%-6s -> %s%n", action, editor.getText());
    }

}
