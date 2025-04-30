import java.util.Scanner;

//Create class EmployeeBonus
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for salary and years of service
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        // Bonus calculation
        if (years > 5) {
            double bonus = 0.05 * salary;
			
			//print the bonus ammount
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}
