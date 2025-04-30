import java.util.Scanner;

// create class  TemperaturCelciusConversion
public class  TemperaturCelciusConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating variable as farenheitResult and Taking user input for farenheitResult
        System.out.print("Enter farenheit: ");
        double farenheitResult = input.nextInt();
        
		// Closing the scanner
        input.close(); 

        // Perform operations while following conversion
        double celsius = (farenheitResult - 32)* 5/9;  
        

        // Display results
        System.out.println("The "+celsius+" celsius is  " + farenheitResult+" farenheit." );
    }
}
