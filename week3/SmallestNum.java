import java.util.Scanner;

//Create class LargestNum
public class LargestNum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for number1, number2 and number3
        System.out.print("Enter  number (number1): ");
        int number1 = input.nextInt();
		
		System.out.print("Enter  number (number2): ");
        int number2 = input.nextInt();
		
		System.out.print("Enter  number (number3): ");
        int number3 = input.nextInt();
		
        // Display   if the first , second or  third  number is largest
        System.out.println(" Is the first number the smallest? "+ (number1 > number2 && number1 > number3));
		System.out.println(" Is the first number the smallest? "+ (number2 > number1 && number2 > number3));
		System.out.println(" Is the first number the smallest? "+ (number3 > number1 && number3 > number2));

		// Close the scanner
        input.close(); 
    }
}

