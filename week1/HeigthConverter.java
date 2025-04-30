import java.util.Scanner;

//Create class HeigthConverter
class HeightConverter {
    public static void main(String[] args) {
		
		//create input as object for scanner
        Scanner input = new Scanner(System.in);
		
		//create variable cm in take input for centimeter 
        System.out.print("Enter your height in cm: ");
        double cm = input.nextDouble();
        input.close();
        
		//create variables inches and feet for conversion
        double inches = cm / 2.54;
        double feet = (int) (inches / 12);
        inches %= 12;
        
		//print feet 
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
    }
}