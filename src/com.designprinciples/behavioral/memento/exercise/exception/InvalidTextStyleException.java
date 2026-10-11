package behavioral.memento.exercise.exception;

public class InvalidTextStyleException extends RuntimeException{

    private static final String DEFAULT_MESSAGE = "Invalid font style provided";

    public InvalidTextStyleException() {
        super(DEFAULT_MESSAGE);
    }

    public InvalidTextStyleException(String message) {
        super(DEFAULT_MESSAGE + ": " + message);
    }
}
