class EBook extends Book {
    public String Epublisher;

    public EBook(int ISBN, String title, String author, String Epublisher) {

        super(ISBN, title, author);
        this.Epublisher = Epublisher;
    }

    public void DisplayEbookDetail() {
        System.out.println("this ISBN :" + ISBN);
        System.out.println("the title is : " + title);
        System.out.println("the pubisher is :" + Epublisher);
        System.out.println("$$$$$$$$$$$$$$$$");
    }
}
