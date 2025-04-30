class Product{

    private static int totalProduct=0;
    private String productName;
    private double price;

    public Product( String productName,double price){
        this.productName = productName;
        this.price=price;
        totalProduct++;
    }

    public void displayProductDetails(){
        System.out.println("Product Name : "+productName);
        System.out.println("Price : "+ price);
        System.out.println("====================");
    }

    public static void  displayTotalProduct(){
        System.out.println("Total number of Product : "+ totalProduct);
        System.out.println("====================");
    }

}

public class MainProductItems {
    public static void main(String[] args) {

       Product prod1 = new Product("biskut", 21);
       prod1.displayProductDetails();
       Product prod2 = new Product("kut", 3023);
        prod2.displayProductDetails();

       Product.displayTotalProduct();
    }
}