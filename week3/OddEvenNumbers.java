import java.util.Scanner;

//create class OddEvenNumbers
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		//create variable n to tame input in scanner
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
			// for loop to travers throught range 
            for (int i = 1; i <= n; i++) {
				//detecting if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }

        scanner.close();
    }
}
