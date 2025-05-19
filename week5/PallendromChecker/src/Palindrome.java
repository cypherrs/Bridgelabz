package PallendromChecker.src;

class Palindrome {
    String text;

    public Palindrome(String text) {
        this.text = text;

    }

    public boolean checker() {
        int len = text.length();


        for (int i = 0; i < len / 2; i++) {
            if (text.charAt(i) != text.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public void displayResult() {
        if (checker()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
