import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Task Manager ======");
            System.out.println("1. Add Task at End");
            System.out.println("2. Add Task at Beginning");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. Display All Tasks");
            System.out.println("6. View Current Task and Move to Next");
            System.out.println("7. Search Task by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1  :{
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = sc.nextLine();
                    System.out.print("Enter Due Date (as number): ");
                    int date = sc.nextInt();
                    taskList.addAtEnd(id, name, priority, date);
                }
                case 2 : {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = sc.nextLine();
                    System.out.print("Enter Due Date (as number): ");
                    int date = sc.nextInt();
                    taskList.addAtBeginning(id, name, priority, date);
                }
                case 3 :{
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = sc.nextLine();
                    System.out.print("Enter Due Date (as number): ");
                    int date = sc.nextInt();
                    taskList.addAtPosition(pos, id, name, priority, date);
                }
                case 4 :{
                    System.out.print("Enter Task ID to Remove: ");
                    int id = sc.nextInt();
                    taskList.removeByTaskId(id);
                }
                case 5 :taskList.displayTasks();
                case 6 :taskList.viewAndMoveToNext();
                case 7 : {
                    System.out.print("Enter Priority to Search (High/Medium/Low): ");
                    String priority = sc.nextLine();
                    taskList.searchByPriority(priority);
                }
                case 0 : System.out.println("Exiting Task Manager...");
                default:  System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
