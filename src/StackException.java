public class StackException extends RuntimeException {
    public StackException() {
        super("Error: Stack Exception");
    }

    public StackException(String message) {
        super(message);
    }
}