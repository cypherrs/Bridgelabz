

import java.util.Scanner;
//Create class RocketLaunchFor
public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // For loop for countdown 
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        //Print the  Launch message
        System.out.println("The rocket has launched!");

        scanner.close();
    }
}
