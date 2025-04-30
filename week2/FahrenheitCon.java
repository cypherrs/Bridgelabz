import java.util.Scanner;

class FahrenheitCon {
  public static void main(String[] args) {
    int celsius, FtC;
    Scanner myObj = new Scanner(System.in); 

    System.out.println("Enter Tempreature in Celsius :");
    celsius = myObj.nextInt(); 

    FtC = (celsius * 9/5)+ 32;  
    System.out.println("Temprature in Fahrenheit: " +FtC); 
  }
}