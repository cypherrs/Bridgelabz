class Queue {
    int front;
    int rear;
    int capacity;
    int[] queue;

    public Queue(int size) {
        front = 0;
        rear = -1;
        capacity = size;
        queue = new int[size];
    }

    public void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue overflow..");
            return;
        }
        queue[++rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow..");
            return -1;
        }
        return queue[front++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty..");
            return -1;
        }
        return queue[front];
    }

    public Boolean isEmpty() {
        return front > rear;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
