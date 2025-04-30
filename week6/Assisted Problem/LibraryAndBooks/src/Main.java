import java.util.ArrayList;

class Book{
    private String title;
    private String author;

    public Book(String title,String author){

        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public void displayBook(){
        System.out.println("Title : "+title+" , Author "+ author );
    }
}

class Library{
    private String libraryName ;
    private ArrayList <Book> books;

    public Library(String libraryName) {
        this.books = new ArrayList<>();
        this.libraryName = libraryName;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        System.out.println("libraty :" +libraryName );
        for(Book book : books){
            book.displayBook();

        }
        System.out.println();
    }


}
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
