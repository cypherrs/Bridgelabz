import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define greatestFactor variable
        int greatestFactor = 1;

        //make  loop from number - 1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { 
                greatestFactor = i; 
                break;              
            }
        }

        // Display the greatest factor
        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        scanner.close();
    }
}
