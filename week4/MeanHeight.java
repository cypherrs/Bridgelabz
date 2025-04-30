import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;
        double mean;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the heights of 11 football players (in cm or meters):");

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        mean = sum / 11;

        System.out.println("\nMean height of the football team is: " + mean);

        input.close();
    }
}
