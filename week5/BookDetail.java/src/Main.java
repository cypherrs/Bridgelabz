import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

class Book{
    public int ISBN;
    private String author;
    protected String title;

    public Book(int ISBN,String title,String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }

    public void displayDetail(){
        System.out.println("this ISBN :"+ISBN);
        System.out.println("the title is : "+title);
        System.out.println("the Author is :"+author);
        System.out.println("==================");
    }
}

class EBook extends Book{
    public String Epublisher;

    public EBook(int ISBN,String title,String author,String Epublisher){

        super(ISBN,title,author);
        this.Epublisher=Epublisher;
    }
    public void DisplayEbookDetail(){
        System.out.println("this ISBN :"+ISBN);
        System.out.println("the title is : "+title);
        System.out.println("the pubisher is :"+Epublisher);
        System.out.println("$$$$$$$$$$$$$$$$");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(1234,"this is my","rup");
        System.out.println("Hello, World!");
        

        b1.displayDetail();

        EBook e1= new EBook(1234,"this is my","rup","jdhbbbvudb");
        e1.DisplayEbookDetail();
    }
}