import java.util.*;
public class CircularBuffer {
    int[] buffer;
    int size,head,tail;
    public CircularBuffer(int size){
        this.size=size;
        this.buffer=new int[size];
        this.head=0;
        this.tail=0;
    }
    public void insert(int value){
        buffer[tail]=value;
        tail=(tail+1)%size;
        if(tail==head){
            head=(head+1)%size;
        }
    }
    public void printbuffer(){
        System.out.print("Buffer: [");
        for (int i = head; i != tail; i = (i + 1) % size) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        CircularBuffer buffer = new CircularBuffer(4);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.printbuffer();
        buffer.insert(4);
        buffer.printbuffer();
    }
}