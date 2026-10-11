package behavioral.memento.exercise.model;

import behavioral.memento.exercise.exception.InvalidTextStyleException;

class TextArea {

    private static final String FONT_NAME = "Times New Roman";
    private static final int MAX_FONT_SIZE = 20;
    private String content;
    private String fontName;
    private int fontSize;

    protected Memento createSnapshot(){
        return new Memento(content, fontName, fontSize);
    }

    protected void restore(Memento snapshot) {
        this.content = snapshot.content();
        this.fontName = snapshot.font();
        this.fontSize = snapshot.fontSize();
    }

    public TextArea() {
        this.content = "";
        this.fontName = FONT_NAME;
        this.fontSize = 10;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content == null) {
            this.content = "";
            return;
        }
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        if (fontSize <= 0 || fontSize > MAX_FONT_SIZE) {
            throw new InvalidTextStyleException(
                    "Font size must be between 1 and " + MAX_FONT_SIZE
            );
        }
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        if (fontSize <= 0){
            throw new InvalidTextStyleException("Font size cannot be decreased");
        }
        if (fontSize > MAX_FONT_SIZE) {
            throw new InvalidTextStyleException("Font size cannot be increased");
        }
        this.fontSize = fontSize;
    }

    protected record Memento(String content, String font, int fontSize){}
}
