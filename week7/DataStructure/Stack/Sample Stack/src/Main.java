class Stack {
    int top;
    int capacity;
    int[] arr ;

    public Stack(int size){
        top =-1;
        capacity = size;
        arr = new int[size];
    }

    public void push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow...");
            return;
        }
        arr[++top] = x;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow..");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack empty...");
            return -1;
        } return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;

    }
    public int size() {
        return top + 1;
    }

    // Display stack
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class GenStack<T>{
    int top ;
    int capacity;
    T[] gstack ;

    public GenStack(int size){
        top = -1;
        capacity  = size;
        gstack = (T[]) new Object[size];
    }

    public void push(T value){
        if (top >= capacity-1){
            System.out.println("Stack Overfow");
            return;
        }
        gstack[++top] = value;
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stak Underflow..");
            return null;
        }
        return gstack[top--];
    }
    public T peek(){
        if (isEmpty()){
            System.out.println("Stak empty..");
            return null;
        }
        return gstack[top];
    }

    public Boolean isEmpty(){

        return top == -1;
    }

    public void printStack(){
        System.out.println("Stack: ");
        for (int i = 0;i<=top;i++){
            System.out.print(gstack[i]+" ");
        }
        System.out.println(" ");
    }

}
public class Main {
    public static void main(String[] args) {
    GenStack <Integer> stack = new GenStack<>(5);
    stack.push(21);
    stack.push(34);
    stack.push(435);
    stack.printStack();
    stack.pop();
    stack.printStack();
        System.out.println("top : "+ stack.peek());
    stack.printStack();

    }
}