import java.util.Scanner;

//create class DiscountCal
public class DiscountCal {
    public static void main(String[] args) {
		
		//create input as object for scanner
        Scanner input = new Scanner(System.in);
		
		//create variable fee in take input fee .
        System.out.print("Enter the Student Fee: ");
        double fee = input.nextDouble();
		
		//create discountPercent as variable to take it as input
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = input.nextDouble();
		
        input.close();
        
		//create variables discount and discountFee for calculating 
		//discount anf final fee
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;
        
		//print discount and final fee
        System.out.println("The discount amount is INR " + String.format("%.2f", discount) + " and final discounted fee is INR " + String.format("%.2f", discountedFee));
    }
}