import java.util.Scanner;

class VolumeCylinder {
  public static void main(String[] args) {
    double radius,height, volume;
    Scanner myObj = new Scanner(System.in); 

    System.out.println("radius OF Cylinder :");
    radius = myObj.nextInt(); 
	System.out.println("height OF Cylinder :");
	height = myObj.nextInt(); 

    volume = 3.14 * radius * radius* height;  
    System.out.println("Volume of Cylinder: " +volume); 
  }
}