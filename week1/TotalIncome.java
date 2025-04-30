import java.util.Scanner;

// create class  TotalIncome
public class  TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating variable as salary and Taking user input for salary
        System.out.print("Enter salary: ");
        double salary = input.nextInt();
		
		//Creating variable as bonus and Taking user input for bonus
		System.out.print("Enter bonus: ");
        double bonus = input.nextInt();
        
		// Closing the scanner
        input.close(); 

        // Perform operations while following conversion
        double totalSalary = salary + bonus;  
        

        // Display results
        System.out.println("The salary is INR " +salary+" and bonus is INR "+bonus+". Hence Total Income is INR " + totalSalary);
    }
}
