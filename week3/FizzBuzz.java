import java.util.Scanner;

//Create class FizzBuzz
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

		int start=1;
        // Prime number check
		while(start <= number){
			
			if (start%3==0 && start%5==0){
				System.out.println("FizzBuzz");
			}else if (start % 3 ==0 ){
				System.out.println("Fizz");
			}else if (start%5==0){
				System.out.println("Buzz");
			}else {
				System.out.println(start);
			}	
			start++;
		}
		scanner.close();
    }
}
