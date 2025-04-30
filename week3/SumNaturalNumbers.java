import java.util.Scanner;

//Create the class SumNaturalNumbers
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Checking if the number is natural (i.e., positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using while loop
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            // Compare the results
            if (sumFormula == sumLoop) {
                System.out.println("Both computations match! The result is correct.");
            } else {
                System.out.println("There is an error in the computation.");
            }
        }

        scanner.close();
    }
}

