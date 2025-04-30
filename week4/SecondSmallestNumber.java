import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int numberOfElement = scanner.nextInt();
		
		int[] numbers = new int[numberOfElement];
		
		System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
		
		
		(int i = 0; i < n; i++) {
            if (numbers[i] < first) {
                second = first;
                first = numbers[i];
            } else if (numbers[i] < second && numbers[i] != first) {
                second = numbers[i];
            }
        }
  