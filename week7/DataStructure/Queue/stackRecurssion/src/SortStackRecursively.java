import java.util.Stack;

class SortStackRecursively {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSortedStack(stack, temp);
        }

    }

    public static void insertSortedStack(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertSortedStack(stack, value);
            stack.push(temp);
        }
    }

    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i) + " ");
        }
        System.out.println();
    }
}
