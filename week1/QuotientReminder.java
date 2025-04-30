import java.util.Scanner;
//Create class QuotientReminder
public class QuotientReminder {
    public static void main(String[] args) {
		
		////Create scanner objet as input 
        Scanner input = new Scanner(System.in);
		
		//Create divident as variable to take input
        System.out.print("Enter divident : ");
		 double divident = input.nextDouble();
		 
		//Create divisor as variable to take input
		 System.out.print("Enter divisor : ");
        double divisor = input.nextDouble();
        input.close();
		
        //Create variables quotient and reminder and calculate
        int quotient = (int) (divident/divisor);
        double reminder = divident % divisor;
        
		//print quotient and reminder after calculation
        System.out.println(" The Quotient is " +quotient+ " and Reminder is " +reminder+ " of two number "+divident+" and "+ divisor);
    }
}



