//Create DiscountCalculator class to calculate discount.
public class DiscountCalculator {
    public static void main(String[] args) {
		
		//Create variable fee and discountPercent and assing value 1 and value 2.
        int fee = 125000, discountPercent = 10;

		//Create variable discount to calculate discount
        double discount = (fee * discountPercent) / 100.0;
 
		//Create variable finalFee .
		double finalFee = fee - discount;

		//print  discount and finalFee
        System.out.println("The discount amount is INR " +  discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
