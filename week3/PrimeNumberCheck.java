import java.util.Scanner;

//Create class PrimeNumberCheck
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prime number check
        boolean isPrime = true;

        if (number < 2) {
			
			 // Numbers less than 2 are not prime
            isPrime = false;
        } else {
			
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
					
					// Found a divisor, not a prime number
                    isPrime = false;  
                    break;
                }
            }
        }

        // Print to Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
