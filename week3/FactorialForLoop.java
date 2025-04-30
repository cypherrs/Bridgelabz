import java.util.Scanner;


//Create class FactorialForLoop
public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
			
			//for loop for factorial
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
			
			//print output
            System.out.println("Factorial of " + n + " is " + factorial);
        }

        scanner.close();
    }
}
