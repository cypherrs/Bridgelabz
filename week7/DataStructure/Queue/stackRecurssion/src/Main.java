import java.util.Stack;
class SortStackRecursively{

    public static void sortStack(Stack<Integer> stack ){
        if (!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insertSortedStack(stack,temp);
        }

    }
    public static void insertSortedStack(Stack<Integer>stack,int value){
        if(stack.isEmpty() || value> stack.peek()){
            stack.push(value);
        }else{
            int temp = stack.pop();
            insertSortedStack(stack, value);
            stack.push(temp);
        }
    }
    public static void printStack(Stack<Integer> stack){
        for(int i = stack.size() - 1;i>=0;i--){
            System.out.println(stack.get(i)+" ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Original Stack:");
        SortStackRecursively.printStack(stack);

        SortStackRecursively.sortStack(stack);

        System.out.println("\nSorted Stack:");
        SortStackRecursively.printStack(stack);    }
}