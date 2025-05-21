interface Category {
    String getCategoryName();
}
class BookCategory implements Category{
    public String getCategoryName(){
        return "Books";
    }
}
class ClothingCategory implements Category{
    public String getCategoryName(){
        return "Clothing";
    }
}
class GadgetsCategory implements Category{
    public String getCategoryName(){
        return "Gadgets";
    }
}
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name,double price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    public void applydiscount(double percent){
        this.price -=price*(percent/100);
    }
    public String getinfo(){
        return name+"("+category.getCategoryName()+"): $"+price;
    }
}
class marketplaceutils{
    public static <T extends Category>void applydiscount(Product<T> product,double percentage){
        product.applydiscount(percentage);
    }
}
class onlinemarketprice{
    public static void main(String[] args){
        Product<BookCategory> book=new Product<>("java programming",50,new BookCategory());
        Product<BookCategory> book1=new Product<>("Java Springboot",45,new BookCategory());
        Product<ClothingCategory> cloth=new Product<>("T-Shirt",60,new ClothingCategory());
        Product<GadgetsCategory> gadget=new Product<>("Watch",70,new GadgetsCategory());
        marketplaceutils.applydiscount(book,10);
        marketplaceutils.applydiscount(book1,15);
        marketplaceutils.applydiscount(cloth,5);
        marketplaceutils.applydiscount(gadget,3);
        System.out.println(book.getinfo());
        System.out.println(book1.getinfo());
        System.out.println(cloth.getinfo());
        System.out.println(gadget.getinfo());
    }
}