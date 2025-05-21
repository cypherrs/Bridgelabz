import java.util.*;
public class ReverseQueue {
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(10,12,30,15));
        System.out.println(queue);
        reverseQueue(queue);
        System.out.println("ReverseQueue: "+queue);
    }
    private static void reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty()){
            return;
        }
        int front=queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }
}
