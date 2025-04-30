//Create class SquareSideCalculator
public class SquareSideCalculator {
    public static void main(String[] args) {
		
		//Create scanner objet as input 
        Scanner input = new Scanner(System.in);
		
		//Create variable perimeter for input
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();
        input.close();
        
		//Create variable side for calculating side
        double side = perimeter / 4;
		
		//print side and perimeter.
        System.out.println("The length of the side is " + side + 
		" whose perimeter is " + perimeter);
    }
}