class Queue{
    int front;
    int rear;
    int capacity;
    int[] queue ;

    public Queue(int size){
        front = 0;
        rear = -1;
        capacity = size;
        queue = new int[size];
    }

    public void enqueue(int x){
        if (rear == capacity-1){
            System.out.println("Queue overflow..");
            return ;
        }
        queue[++rear]= x;
    }

    public int dequeue (){
        if (isEmpty()){
            System.out.println("Queue Underflow..");
            return -1;
        }
        return  queue[front++];
    }

    public int peek (){
        if (isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        return  queue[front];
    }

    public Boolean isEmpty(){
        return front> rear;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue: ");
        for(int i = front; i <= rear ; i++){
            System.out.print(queue[i]+ " ");
        }
        System.out.println();
    }
}

class GenQueue<T>{
    int front;
    int rear ;
    int capacity;
    T[] queue ;

    public GenQueue(int size){
        front = 0 ;
        rear = -1;
        capacity=size;
        queue = (T[]) new Object[size];
    }

    public void enqueue(T value){
        if(rear == capacity-1){
            System.out.println("Queue is overflow..");
            return ;
        }
        queue[++rear] =value;
    }
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is underFlow");
            return null;
        }
        return queue[front++];
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        return queue[front];
    }

    public Boolean isEmpty(){
        return front> rear;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("Queue: ");
        for (int i = front;i <= rear;i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
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