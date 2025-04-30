import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();

        // Initialize result to 1
        int result = 1;

        // Loop to multiply the number power times
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
