public class Main {
    public static void main(String[] args) {
        QueueStacks<Integer> queue = new QueueStacks<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());
    }
}