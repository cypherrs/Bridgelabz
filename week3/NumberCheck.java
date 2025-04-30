import java.util.Scanner;

//Create class NumberCheck
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        
        
            int number = scanner.nextInt();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        scanner.close(); // Closing scanner to prevent resource leak
    }
}
