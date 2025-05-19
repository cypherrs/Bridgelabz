class Stack {
    int top;
    int capacity;
    int[] arr;

    public Stack(int size) {
        top = -1;
        capacity = size;
        arr = new int[size];
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow...");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow..");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack empty...");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;

    }

    public int size() {
        return top + 1;
    }

    // Display stack
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
