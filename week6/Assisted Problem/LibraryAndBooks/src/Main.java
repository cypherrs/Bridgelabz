public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");


        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");


        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);


        cityLibrary.displayBooks();
        schoolLibrary.displayBooks();
    }
}
