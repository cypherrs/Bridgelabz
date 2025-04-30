import java.util.Scanner;
//Create class SpringSeason
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create variable input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Checking if the given date falls in Spring Season
        if ((month == 3 && day >= 20 && day <= 31) ||  // March 20-31
            (month == 4 && day >= 1 && day <= 30) ||   // April 1-30
            (month == 5 && day >= 1 && day <= 31) ||   // May 1-31
            (month == 6 && day >= 1 && day <= 20)) {   // June 1-20

            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        scanner.close();
    }
}
