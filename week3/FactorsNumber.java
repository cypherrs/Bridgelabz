import java.util.Scanner;

public class FactorsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create  user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        // Initialize result to 1
        int result = 1;

        // Loop to multiply the number power times
        for (int i = 1; i < number; i++) {
           if(number % i ==0){
			   
			   System.out.println("farctor of the number: "+ i );
		   }
        }
        scanner.close();
    }
}
