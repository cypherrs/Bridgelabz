import java.util.Scanner;

class AreaOfCircle {
  public static void main(String[] args) {
    double radius, area;
    Scanner myObj = new Scanner(System.in); 

    System.out.println("AREA OF CIRCLE :");
    radius = myObj.nextInt(); 

    area = 3.14 * radius * radius;  
    System.out.println("Area of Circle: " +area); 
  }
}