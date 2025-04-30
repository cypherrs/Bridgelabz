import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>fruits=new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Orange");
        fruits.add("banana");
        System.out.println("Fruits: " + fruits);
        fruits.addFirst("hamara");
        System.out.println("Second fruit: " + fruits);
        fruits.addLast("papaya");
        System.out.println("Second fruit: " + fruits);
        fruits.remove("banana");
        System.out.println("After removing Banana: " + fruits);


    }
}