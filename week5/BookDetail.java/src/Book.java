class Book {
    public int ISBN;
    private String author;
    protected String title;

    public Book(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void displayDetail() {
        System.out.println("this ISBN :" + ISBN);
        System.out.println("the title is : " + title);
        System.out.println("the Author is :" + author);
        System.out.println("==================");
    }
}
