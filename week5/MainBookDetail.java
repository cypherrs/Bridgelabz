import java.util.Scanner;

// method class for bookdetail
class BookDetail{
	String title; 
	String author;
	int price;
	
	//create constructor for  
	public BookDetail(String title,String author,int price){
		this.title=title;
		this.author = author;
		this.price = price;
	}
	
	//method to display result
	public void displaydetail(){
		System.out.println("Title of the the book is "+title+ " by "+author+" and the cost is : $"+ price);
	}
}

//create mian class for book detail
public class MainBookDetail{	
	public static void main(String[] args){
		
		//System.out.println("Enter the Title: ");

		//System.out.println("Enter the author: ");
		
		//System.out.println("Enter the Price: ");
		
		BookDetail bd1 = new BookDetail("the line of meee","rupesh",123);
		bd1.displaydetail();
	}
	
}