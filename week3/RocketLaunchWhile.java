import java.util.Scanner;

//Create class RocketLaunchWhile
public class RocketLaunchWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create variable counter and Take user input for countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // While loop for countdown and Decrement counter
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  
        }

        // Print Launch message
        System.out.println("The rocket has launched!");

        scanner.close();
    }
}

