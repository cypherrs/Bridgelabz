
// Create ProfitLossCalculator Class to calculate the profit and 
//loss in number and percentag.
public class ProfitLossCalculator {
    public static void main(String[] args) {
		
		//Create variable costPrice and sellingPrice and assign the value 1 and value 2.
        int costPrice = 129, sellingPrice = 191;

		//Create variable profit to calculate profit from costPrice and sellingPrice.
        int profit = sellingPrice - costPrice;
		
		//Create variable profitPercentage to calculate profit percentage
        double profitPercentage = (profit / (double) costPrice) * 100;
		
		//Print the profit and it's percentage
       
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + 
                           String.format("%.2f", profitPercentage) + "%");
    }
}
