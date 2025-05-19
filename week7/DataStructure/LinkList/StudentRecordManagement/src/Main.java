import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList(); // create a new student list
        Scanner sc = new Scanner(System.in);
        int choice;

        // Display menu until user chooses to exit
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Specific Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade by Roll Number");
            System.out.println("7. Display All Records");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            int roll, age, pos;
            String name, grade;

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next();
                    list.addAtBeginning(roll, name, age, grade);
                    break;

                case 2:
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next();
                    list.addAtEnd(roll, name, age, grade);
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next();
                    list.addAtPosition(pos, roll, name, age, grade);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    roll = sc.nextInt();
                    list.deleteByRoll(roll);
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Search: ");
                    roll = sc.nextInt();
                    list.searchByRoll(roll);
                    break;

                case 6:
                    System.out.print("Enter Roll Number to Update Grade: ");
                    roll = sc.nextInt();
                    System.out.print("Enter New Grade: ");
                    grade = sc.next();
                    list.updateGrade(roll, grade);
                    break;

                case 7:
                    list.displayAll();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8); // exit loop when user selects 8

        sc.close();


    }
}