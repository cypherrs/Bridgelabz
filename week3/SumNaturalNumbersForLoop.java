import java.util.Scanner;

//Create a class SumNaturalNumbersForLoop
public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input as input variable
        System.out.print("Enter a natural number: ");
        int input = scanner.nextInt();

        if (input <= 0) {
            System.out.println("The number " + input + " is not a natural number.");
        } else {
            // Sum using formula
            int sumFormula = input * (input + 1) / 2;

            // Sum using for loop
            int sumLoop = 0;
            for (int i = 1; i <= input; i++) {
                sumLoop += i;
            }


            // Validate correctness
            System.out.println(sumFormula == sumLoop ? "Both computations match!" : "Error in computation.");
        }

        scanner.close();
    }
}
