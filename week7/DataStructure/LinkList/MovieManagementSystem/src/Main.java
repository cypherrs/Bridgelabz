import java.util.Scanner;

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

