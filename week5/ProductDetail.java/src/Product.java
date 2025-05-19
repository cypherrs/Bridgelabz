class Product {

    private static int totalProduct = 0;
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProduct++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("====================");
    }

    public static void displayTotalProduct() {
        System.out.println("Total number of Product : " + totalProduct);
        System.out.println("====================");
    }

}
