class Product {
    private static double discount = 0.0;
    private String productName;
    private int price;
    private int quantity;
    private final int productID;

    public Product(int productID, String productName, int price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) { // Checking instance type
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price after Discount: $" + (price - (price * discount / 100)));
            System.out.println("---------------------------------");
        } else {
            System.out.println("Invalid product!");
        }


    }
}
