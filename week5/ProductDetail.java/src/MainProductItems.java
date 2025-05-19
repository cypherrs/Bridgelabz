public class MainProductItems {
    public static void main(String[] args) {

       Product prod1 = new Product("biskut", 21);
       prod1.displayProductDetails();
       Product prod2 = new Product("kut", 3023);
        prod2.displayProductDetails();

       Product.displayTotalProduct();
    }
}