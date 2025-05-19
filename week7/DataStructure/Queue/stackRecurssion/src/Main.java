import java.util.Stack;

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