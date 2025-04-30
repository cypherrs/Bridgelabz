import java.util.Scanner;

public class CheckNum {

    public static void main(String[] args) {
        int[] numbers = new int[5]; // Corrected array declaration
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers in the array:");

        // Input loop for 5 numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop to check each number's sign and even/odd
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                System.out.println("The number " + numbers[i] + " is a positive number.");

                if (numbers[i] % 2 == 0) { // Fixed assignment (=) to comparison (==)
                    System.out.println("The number " + numbers[i] + " is an even number.");
                } else {
                    System.out.println("The number " + numbers[i] + " is an odd number.");
                }
            } else if (numbers[i] == 0) {
                System.out.println("The number " + numbers[i] + " is zero.");
            } else {
                System.out.println("The number " + numbers[i] + " is a negative number.");
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else if (numbers[0] == numbers[4]) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is smaller than the last element.");
        }

        input.close(); // Always good to close the scanner
    }
}
