public class NthElement {
    static class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void push(String new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static String findNthFromEnd(int N) {
        if (head == null) {
            return "List is empty";
        }
        Node firstPointer = head;
        Node secondPointer = head;
        for (int i = 0; i < N; i++) {
            if (firstPointer == null) {
                return "N is larger than the length of the list";
            }
            firstPointer = firstPointer.next;
        }
        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return secondPointer.data;
    }
    public static void main(String[] args) {
        push("E");
        push("D");
        push("C");
        push("B");
        push("A");
        int N = 2;
        System.out.println("The " + N + "th element from the end is: " + findNthFromEnd(N));
    }
}
