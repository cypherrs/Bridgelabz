import java.util.Scanner;
public class SimpleInterest {
  public static void main(String[] args) {
    double principal, rate ,time , simpleIn;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter Principal amount:");
    principal = myObj.nextInt();

    System.out.println("Enter Rate:");
    rate = myObj.nextInt(); 
	System.out.println("Enter time:");
    time = myObj.nextInt(); 

    simpleIn = (principal*rate*time)/100;  
    System.out.println("simple interest is: " + simpleIn); 
  }
} 