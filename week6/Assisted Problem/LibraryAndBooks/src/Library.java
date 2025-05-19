import java.util.ArrayList;

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.books = new ArrayList<>();
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("libraty :" + libraryName);
        for (Book book : books) {
            book.displayBook();

        }
        System.out.println();
    }


}
