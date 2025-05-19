class GenStack<T> {
    int top;
    int capacity;
    T[] gstack;

    public GenStack(int size) {
        top = -1;
        capacity = size;
        gstack = (T[]) new Object[size];
    }

    public void push(T value) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overfow");
            return;
        }
        gstack[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stak Underflow..");
            return null;
        }
        return gstack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stak empty..");
            return null;
        }
        return gstack[top];
    }

    public Boolean isEmpty() {

        return top == -1;
    }

    public void printStack() {
        System.out.println("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(gstack[i] + " ");
        }
        System.out.println(" ");
    }

}
