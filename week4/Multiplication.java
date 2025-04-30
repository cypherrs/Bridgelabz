
import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        int[] multiple = new int[10]; 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers:");
		int number = input.nextInt();
		
		for(int i = 0;i<10;i++){
			multiple[i] = number * (i+1);
			System.out.println(number + " * " + (i+1) +" = "+multiple[i]);
		}
		
		
	}
	
}	