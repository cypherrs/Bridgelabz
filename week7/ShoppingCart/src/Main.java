public class Main {
    public static void main(String[] args) {

       System.out.println("Hello, World!");
       Product.updateDiscount(10.0);


        Product product1 = new Product(101, "Laptop", 1500, 2);
        Product product2 = new Product(102, "Smartphone", 800, 5);

        product1.displayProductDetails();
        product2.displayProductDetails();


    }
}