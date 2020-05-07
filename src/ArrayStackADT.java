public interface ArrayStackADT<T> {
    //Initializes stack to empty state
    void initializeStack();
    //Determines whether stack is empty
    boolean isEmptyStack();
    //Determines whether stack is full
    boolean isFullStack();
    //If the stack is not full, add the T item to the top
    //Throw StackOverflowException if stack is full
    void push(T item);
    //If the stack is not empty, view & return the item at the top
    //Throw StackUnderflowException if stack is empty
    T peek();
    //If the stack is not empty, remove the item at the top
    //Throw StackUnderflowException if stack is empty
    void pop();
}