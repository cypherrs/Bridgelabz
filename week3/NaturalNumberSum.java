import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) { // Check if input is an integer
            int number = scanner.nextInt();

			// Check if it's a positive integer
            if (number > 0) { // Check if it's a positive integer
				
				//Create variable sum for sum of natural numbers
                int sum = number * (number + 1) / 2; // Sum formula
                System.out.println("The sum of " + number + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + number + " is not a natural number");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
		
		// Closing scanner to prevent resource leak
        scanner.close(); // Closing scanner to prevent resource leak
    }
}
