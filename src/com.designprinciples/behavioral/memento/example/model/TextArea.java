package behavioral.memento.example.model;

class TextArea {
    private String text = "";

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }

    Memento createSnapshot(){
        return new Memento(text);
    }

    void restore(Memento memento) {
        this.text = memento.text();
    }

    record Memento(String text) {
    }
}
