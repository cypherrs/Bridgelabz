public class DemoStack<PlaceHolder>{
    PlaceHolder[] d2 = (PlaceHolder[]) new Object[100];

    int front = -1;
    int rear = -1;

    void deque(){
        if( front == rear){
            System.out.println("queue is empty");
        }else{
            ++front;
            System.out.println(d2[front]);

        }
    }

    void enque(PlaceHolder a){
        if (rear == d2.length-1){
            System.out.println("Stack is full");
        }else{
            if(front == -1){
                front++;
            }
            ++rear;
            d2[rear] = a;
        }
    }
}
