import java.util.Scanner;

//create class YoungestAndTallest
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
		
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
		
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();

        // Taking input for heights
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();
		
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();
		
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();

        // Finding the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Finding the tallest friend
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        // Displaying results
        System.out.println("\nYoungest Friend: " + youngestFriend + " (Age: " + youngestAge + " years)");
        System.out.println("Tallest Friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        scanner.close();
    }
}
