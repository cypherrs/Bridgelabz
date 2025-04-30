import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        
        if (scanner.hasNextInt()) { // Check if input is an integer
            int number = scanner.nextInt();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close(); // Closing scanner to prevent resource leak
    }
}
