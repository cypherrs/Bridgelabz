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