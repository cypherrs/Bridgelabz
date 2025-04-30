import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100:");

        // Loop from 100 down to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) { // Check if i is a multiple of number
                System.out.print(i + " "); // Print the multiple
            }
        }

        scanner.close();
    }
}
