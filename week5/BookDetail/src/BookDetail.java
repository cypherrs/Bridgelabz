package BookDetail.src;

// method class for bookdetail
class BookDetail {
    String title;
    String author;
    int price;

    //create constructor for
    public BookDetail(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to display result
    public void displaydetail() {
        System.out.println("Title of the the book is " + title + " by " + author + " and the cost is : $" + price);
    }
}
