import java.util.Scanner;


public class KilometersToMiles {
  public static void main(String[] args) {
    double miles,kilometers ;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter Kilometers :");
    kilometers = myObj.nextInt();

	
	miles = kilometers * 0.621371;      
    System.out.println("Miles: " + miles); 
  }
} 