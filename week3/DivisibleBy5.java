import java.util.Scanner;

//Create class SwapNumbers
public class DivisibleBy5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for number1 and number2
        System.out.print("Enter  number (number1): ");
        int number1 = input.nextInt();
		
        // Display  number is divisible or not
        System.out.println(" Is the number "+number1+" divisible by 5? "+ (number1 % 5 == 0));

        input.close(); // Close the scanner
    }
}

