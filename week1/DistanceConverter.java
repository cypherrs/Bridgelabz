
//Create class DistanceConverter
public class DistanceConverter {
    public static void main(String[] args) {
		
		////Create scanner objet as input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
		
		//Create feet as variable to take input
        double feet = input.nextDouble();
        input.close();
		
        //Create variables yard and miles and calculate
        double yards = feet / 3;
        double miles = yards / 1760;
        
		//print yard and miles after conversion
        System.out.println("The distance in yards is " +  yards + " and in miles is " + String.format("%.2f", miles));
    }
}
// Program 8: Purchase Price Calculation
public class PurchasePriceCalculator {
    public static void main(String[] args) {
		
		////Create scanner objet as input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
		
		//Create variable unitPrice for input
        double unitPrice = input.nextDouble();
		
		//Create varible quantity for input
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.close();
        
		//Create variable totalPricefor calculation
        double totalPrice = unitPrice * quantity;
		
		//print 
        System.out.println("The total purchase price is INR " +  totalPrice + 
		" if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}

// Program 9: Maximum Handshakes Calculation
class HandshakeCalculator {
    public static void main(String[] args) {
		
		////Create scanner objet as input
        Scanner input = new Scanner(System.in);
		
		//Create variable numberOfStudents for input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.close();
        
		//Create varible maxHandshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes possible among " + numberOfStudents + " students is " + maxHandshakes);
    }
}
