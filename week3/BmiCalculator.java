import java.util.Scanner;

//Create class BmiCalculator
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user for weight and height
        System.out.print("Enter a weight(kg): ");
        double weight = scanner.nextInt();
		        
		System.out.print("Enter a height(cm): ");
        double heightCm = scanner.nextInt();  
		
		//create variable heightmeter to convert cm to meter
		double height = heightCm / 100;
		
		//Calculate BMI
		double BMI = weight/(height * height);
		System.out.println(BMI);
		
		//Condition for diffterent range of BMI 
		if (BMI <= 18.4){
				System.out.println("Underweight");
			}else if (BMI <= 24.9){
				System.out.println("Normal");
			}else if (BMI <= 39.9){
				System.out.println("Overweight");
			}else {
				System.out.println("Obese");
			}	
		
		scanner.close();
    }
}
