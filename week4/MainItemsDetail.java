import java.util.Scanner;

// method class for bookdetail
class ItemsDetail{
	int itemCode; 
	String items ;
	int price;
	
	//create constructor for  
	public ItemsDetail(int itemCode,String items,int price){
		this.itemCode=itemCode;
		this.items = items;
		this.price = price;
	}
	
	//method to display result
	public void displaydetail(){
		System.out.println("Item code :"+itemCode+ " for Item "+items+" at cost : "+ price);
	}
}

//create mian class for book detail
public class MainItemsDetail{	
	public static void main(String[] args){
		
		//System.out.println("Enter the Title: ");

		//System.out.println("Enter the author: ");
		
		//System.out.println("Enter the Price: ");
		
		ItemsDetail id1 = new ItemsDetail(001,"rupesh",123);
		id1.displaydetail();
	}
	
}