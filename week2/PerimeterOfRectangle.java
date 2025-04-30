import java.util.Scanner;
//import java.util.Math;

public class PerimeterOfRectangle {
  public static void main(String[] args) {
    int length, breath ,perimeter;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter length:");
    length = myObj.nextInt();

    System.out.println("Enter breath:");
    breath = myObj.nextInt(); 
	
	double	a = Math.pow(2,2);
	System.out.println(a);
	
	
	

    perimeter = 2*(length+breath);  
    System.out.println("simple interest is: " + perimeter); 
  }
} 