import java.util.Scanner;

//Create class SwapNumbers
public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for number1 and number2
        System.out.print("Enter first number (number1): ");
        int number1 = input.nextInt();

        System.out.print("Enter second number (number2): ");
        int number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close(); // Close the scanner
    }
}
