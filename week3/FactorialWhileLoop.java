import java.util.Scanner;

//create class FactorialWhileLoop
public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

		
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
			//create variable factorial 
            int factorial = 1, i = 1;

            while (i <= n) {
				//multiply to it self
                factorial *= i;
                i++;
            }

			//print the output
            System.out.println("Factorial of " + n + " is " + factorial);
        }

        scanner.close();
    }
}
