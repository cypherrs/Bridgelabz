import java.util.Scanner;
class Movie{
    String title;
    String director;
    int year;
    int rating;

    Movie next;
    Movie prev;

    public Movie(String title,String director,int year,int rating){
        this.director=director;
        this.title=title;
        this.year=year;
        this.rating=rating;

        this.next=null;
        this.prev=null;
    }
}

class MoviesList{
    private Movie head;
    private Movie tail;

    public void addAtBegining(String title,String director,int year,int rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if (head ==null){
            head=tail=newMovie;
        }else{
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;

        }

    }

    public void addAtEnd(String title,String director,int year,int rating){
        Movie newMovie = new Movie(title,director,year,rating);
        if (head == null){
            head = tail = newMovie;
        } else{
        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
        }
        System.out.println("movie added at the end..");
    }

    public void addAtPosition(int position, String title,String director,int year,int rating ){
        if(position <=0){
            System.out.println("Invalid position..!");
            return;
        }
        if (position ==1){
            addAtBegining(title,director,year,rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;

        for(int i =1;i< position-1 && temp != null;i++){
            temp = temp.next;
        }

        if (temp == null){
            System.out.println("Position out of bound..");
            return;
        }

        newMovie.next = temp.next;
        newMovie.prev= temp;
        if(temp.next != null){
            temp.next.prev= newMovie;
        }
        temp.next = newMovie;

        if(newMovie.next == null){
            tail = newMovie;
        }
        System.out.println("Movies added at position " +position);
    }

    public void removeByTitle(String title){
        Movie temp = head;

        while(temp !=null && temp.title != title){
            temp= temp.next;
        }
        if (temp == null){
            System.out.println("Movies not found..");
            return;
        }

        if (temp == head){
            head = temp.next;
            if(head !=null){
                head.prev =null;
            }
        }else if (temp == tail){
            tail = temp.prev;
            tail.next = null;
        }else {
            temp.prev.next =  temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Movie : "+ title+" removed..");
    }
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println("Found: " + temp.title + " (Year: " + temp.year + ", Rating: " + temp.rating + ")");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found by this director.");
        }
    }

    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found: " + temp.title + " (Director: " + temp.director + ", Year: " + temp.year + ")");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }
    public void updateRating(String title, int newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Old Rating: " + temp.rating);
                temp.rating = newRating;
                System.out.println("Updated Rating: " + temp.rating);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    public void displayForward(){
        if (head == null) {
            System.out.println("No movies found.");
            return;
        }

        Movie temp = head;
        System.out.println("\nMovies (Forward Order):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies found.");
            return;
        }

        Movie temp = tail;
        System.out.println("\nMovies (Reverse Order):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }


}

public class Main {
    public static void main(String[] args) {

        MoviesList list = new MoviesList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Update Rating");
            System.out.println("8. Display Movies (Forward)");
            System.out.println("9. Display Movies (Reverse)");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            String title, director;
            int year, pos;
            double rating;

            switch (choice) {
                case 1: case 2: case 3:
                    System.out.print("Enter Title, Director, Year, Rating: ");
                    title = sc.nextLine();
                    director = sc.nextLine();
                    year = sc.nextInt();
                    rating = sc.nextDouble();
                    if (choice == 1) {list.addAtBegining(title,director,year, (int) rating);}
                    else if (choice == 2) list.addAtEnd(title, director, year, (int) rating);
                    else { System.out.print("Enter Position: "); pos = sc.nextInt(); list.addAtPosition(pos, title, director, year, (int) rating); }
                    break;
                case 4: System.out.print("Enter Title: ");
                list.removeByTitle(sc.nextLine()); break;
                case 5: System.out.print("Enter Director: "); list.searchByDirector(sc.nextLine()); break;
                case 6: System.out.print("Enter Rating: "); list.searchByRating(sc.nextDouble()); break;
                case 7: System.out.print("Enter Title & New Rating: "); list.updateRating(sc.next(), sc.nextInt()); break;
                case 8: list.displayForward(); break;
                case 9: list.displayReverse(); break;
            }
        } while (choice != 10);
        sc.close();
    }
}

