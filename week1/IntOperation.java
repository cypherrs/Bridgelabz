import java.util.Scanner;
// create class IntOperation
public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating variable as a,b,c and Taking user input for a, b, and c
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        
        input.close(); // Closing the scanner

        // Perform operations while following operator precedence
        int result1 = a + b * c;  
        int result2 = a * b + c;  
        int result3 = c + a / b; 
		int result4 = a % b + c; 

        // Display results
        System.out.println("The results of Int Operations are " + result1+", "+result2+","+result3+" and " +result4);

    }
}
