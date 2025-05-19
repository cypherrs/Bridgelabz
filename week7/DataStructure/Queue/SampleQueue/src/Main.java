public class Main {
    public static void main(String[] args) {
        //Queue q = new Queue(5);
        GenQueue<Integer> q = new GenQueue<>(5);

        q.enqueue(1);
        q.enqueue(6);
        q.enqueue(76);
        q.printQueue();

        q.dequeue();
        q.printQueue();

        System.out.println("Front: " + q.peek());
    }
}