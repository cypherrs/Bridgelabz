public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Book book1 = new Book("1984", "George Orwell", 123456789);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 987654321);

        book1.displayBookDetails();
        book2.displayBookDetails();

        Book.displayLibraryName(); // Display library name
    }
}