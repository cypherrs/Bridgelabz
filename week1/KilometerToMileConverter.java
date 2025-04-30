
import java.util.Scanner;

//// Create KilometersToMiles Class to  convert kilometers to miles.
public class KilometerToMileConverter {
    public static void main(String[] args) {
		
		//Create input as object for scanner.
        Scanner input = new Scanner(System.in);
		
		//Creating km as variable for taking input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        input.close();
        
		//Create variable name miles to convert kilometers to miles
        double miles = km / 1.6;
        
		//print miles
        System.out.println("The total miles is " + String.format("%.2f", miles) + " mile for the given " + km + " km");
    }
}
