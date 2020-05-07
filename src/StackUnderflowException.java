public class StackUnderflowException extends StackException {
    public StackUnderflowException() {
        super("Error: Stack Underflow");
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}