import java.util.Stack;

class QueueStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void enqueue(T value) {
        stack1.push(value);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {

        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void printQueue() {
        System.out.print("Queue (front → rear): ");

        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }
}
