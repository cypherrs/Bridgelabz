import java.util.Scanner;

//Create class VotingEligibility to check if the person can vote 
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the person's age: ");
        
		// Check if input is an integer
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            // Check if the person is eligible to vote
            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer for age.");
        }

		// Closing scanner to prevent resource leak
        scanner.close(); 
    }
}
