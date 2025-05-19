class GenQueue<T> {
    int front;
    int rear;
    int capacity;
    T[] queue;

    public GenQueue(int size) {
        front = 0;
        rear = -1;
        capacity = size;
        queue = (T[]) new Object[size];
    }

    public void enqueue(T value) {
        if (rear == capacity - 1) {
            System.out.println("Queue is overflow..");
            return;
        }
        queue[++rear] = value;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is underFlow");
            return null;
        }
        return queue[front++];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return queue[front];
    }

    public Boolean isEmpty() {
        return front > rear;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
