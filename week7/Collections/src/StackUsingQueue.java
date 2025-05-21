import java.util.*;
public class StackUsingQueue {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    public void push(int x){
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
    }
    public int pop() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return queue1.poll();
    }
    public int top(){
        if(queue1.isEmpty()){
            throw new NoSuchElementException("Stack is Empty");
        }
        return queue1.peek();
    }
    public static void main(String[] args){
        StackUsingQueue stack=new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Top: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
