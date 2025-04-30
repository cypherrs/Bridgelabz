import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double number = input.nextDouble();

            if (number <= 0) {
                System.out.println("Stopping input as a non-positive number was entered.");
                break;
            }

            numbers[index] = number;
            index++;

            if (index == 10) {
                System.out.println("Array is full. No more input can be stored.");
                break;
            }
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal sum of all numbers: " + total);

        input.close();
    }
}
