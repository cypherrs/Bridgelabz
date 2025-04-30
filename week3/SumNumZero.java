

import java.util.Scanner;
//Create class SumNumZero
public class SumNumZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for countdown start value
        System.out.print("Enter the countdown start value: ");
        double number = scanner.nextInt();
		
		double sum = 0;
        // For loop for countdown 
        while(number != 0) {
			sum += number;
            number = scanner.nextInt();
        }
		System.out.println("The total value is: "+ sum);
        scanner.close();
    }
}
