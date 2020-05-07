public class StackOverflowException extends StackException {
    public StackOverflowException() {
        super("Error: Stack Overflow");
    }

    public StackOverflowException(String message) {
        super(message);
    }
}