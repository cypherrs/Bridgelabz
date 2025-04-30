import java.util.Scanner;

//Create an class Armstrong
public class Armstrong{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Create variable input number
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		int originalNumber = number;
		int numLength = (int) (Math.log10(number) + 1);
		int sum= 0;
		//while loop
		while(number!=0){
			
			sum += (int) Math.pow(number%10, numLength);
			number /= 10;
		}
		System.out.print(sum);
		
		//check if the number is armstrong
		 if(sum == originalNumber){
		 System.out.print("the number "+originalNumber+" is  a armstrong number.");
		 } else {
			 System.out.print("The number "+ originalNumber+" is not a armstrong number." );
		 }
	}

}