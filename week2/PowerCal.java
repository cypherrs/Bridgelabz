import java.util.Scanner;
//import java.util.Math;

public class PowerCal {
  public static void main(String[] args) {
    double bass, power ,powwercal;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter power number:");
    power = myObj.nextInt();

    System.out.println("Enter bass number:");
    bass = myObj.nextInt(); 
	
	powwercal = Math.pow(bass,power);
	
	
	
	

      
    System.out.println("power clculation is: " + powwercal); 
  }
} 