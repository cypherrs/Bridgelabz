import java.util.Scanner;

// create class  TemperaturConversion
public class  TemperaturConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating variable as celsius and Taking user input for celsius
        System.out.print("Enter celsius: ");
        double celsius = input.nextInt();
        
		// Closing the scanner
        input.close(); 

        // Perform operations while following conversion
        double farenheitResult  = (celsius* 1.8)+32;  
        

        // Display results
        System.out.println("The "+celsius+" celsius is  " + farenheitResult+" farenheit." );
    }
}
