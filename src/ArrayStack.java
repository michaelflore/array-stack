public class ArrayStack<T> implements ArrayStackADT<T> {

    private int maxSize;
    private int stackTop;
    private T[] stackArray;

    //Default Constructor
    public ArrayStack() {
        maxSize = 100;
        stackTop = 0;
        stackArray = (T[]) new Object[maxSize];
    }

    //Overloaded constructor
    public ArrayStack(int size) {
        if(size <= 0) {
            System.out.print("The size of the array must be a positive integer.");
        }
        else {
            maxSize = size;
            stackTop = 0;
            stackArray = (T[]) new Object[maxSize];
        }
    }

    //Copy constructor
    public ArrayStack(ArrayStack<T> anotherStack) {
        maxSize = anotherStack.maxSize;
        stackTop = anotherStack.stackTop;
        stackArray = (T[]) new Object[maxSize];

        ArrayStack<T> tempStack = new ArrayStack<T>(maxSize);
        while(!anotherStack.isEmptyStack()) {
            tempStack.push(anotherStack.peek());
            anotherStack.pop();
        }

        while(!tempStack.isEmptyStack()) {
            this.push(tempStack.peek());
            tempStack.pop();
        }
    }

    //Initializes stack to empty state
    public void initializeStack() {
        for(int i = 0; i < stackTop; i++) {
            stackArray[i] = null;
        }

        stackTop = 0;
    }

    //Determines whether stack is empty
    public boolean isEmptyStack() {
        if(stackTop == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //Determines whether stack is full
    public boolean isFullStack() {
        if(stackTop == maxSize) {
            return true;
        }
        else {
            return false;
        }
    }

    //If the stack is not full, add the T item to the top
    //Throw StackOverflowException if stack is full
    public void push(T item) throws StackOverflowException {
        if(this.isFullStack()) {
            throw new StackOverflowException();
        }
        else {
            stackArray[stackTop] = item;
            stackTop++;
        }
    }

    //If the stack is not empty, view & return the item at the top
    //Throw StackUnderflowException if stack is empty
    public T peek() throws StackUnderflowException {
        if(this.isEmptyStack()) {
            throw new StackUnderflowException();
        }

        return stackArray[stackTop - 1];
    }

    //If the stack is not empty, remove the item at the top
    //Throw StackUnderflowException if stack is empty
    public void pop() throws StackUnderflowException {
        if(this.isEmptyStack()) {
            throw new StackUnderflowException();
        }

        stackTop--;
        stackArray[stackTop] = null;
    }
}