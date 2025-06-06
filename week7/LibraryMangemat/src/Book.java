public class Book {
    private static String libraryName = "mayank pal babab";
    private final int isbn;

    private String title;
    private String author;


    public Book(String title, String author, int isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public static void displayLibraryName() {
        System.out.println("the Library name : " + libraryName);

    }

    public void displayBookDetails() {
        if (this instanceof Book) { // Checking instance type
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book!");
        }

    }
}
