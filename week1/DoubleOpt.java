import java.util.Scanner;

// create class DoubleOpt
public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating variable as a,b,c and Taking user input for a, b, and c
        System.out.print("Enter value for a: ");
        double a = input.nextInt();

        System.out.print("Enter value for b: ");
        double b = input.nextInt();

        System.out.print("Enter value for c: ");
        double c = input.nextInt();
        
        input.close(); // Closing the scanner

        // Perform operations while following operator precedence
        double result1 = a + b * c;  
        double result2 = a * b + c;  
        double result3 = c + a / b; 
		double result4 = a % b + c; 

        // Display results
        System.out.println("The results of Int Operations are " + result1+", "+result2+","+result3+" and " +result4);

    }
}
