public class MainPallendromChecker{
    public static void main(String[] args) {
        Palindrome p = new Palindrome("madam");
        p.displayResult(); // Output: madam is a palindrome.
        
        Palindrome p2 = new Palindrome("hello");
        p2.displayResult(); // Output: hello is not a palindrome.
    }
}
