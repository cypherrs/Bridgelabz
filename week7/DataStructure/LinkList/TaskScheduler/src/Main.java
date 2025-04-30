import java.util.Scanner;
class Task{
    int id;
    String taskName;
    String priority;
    int dueDate;

    Task next;

    public Task(int id,String taskName,String priority,int dueDate){
        this.id = id;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate=  dueDate;
        this.next = null;
    }

}

class TaskList{
    Task head = null;
    Task tail = null;

    public void addAtEnd(int id,String taskName,String priority,int dueDate){
        Task newTask =new Task(id, taskName, priority, dueDate);
        if (head == null){
            head = newTask;
            tail=newTask;
            newTask.next = head;
        }
        else{
            tail.next = newTask;
            tail = newTask;
            tail.next = head;

        }
        System.out.println("New task is added.....");
    }

    public void addAtBeginning(int id,String taskName,String priority,int dueDate) {
        Task newTask = new Task(id, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addAtPosition(int position , int id,String taskName,String priority,int dueDate){
        Task newTask = new Task(id,taskName,priority,dueDate);
        Task temp= head;

        if(position <= 1 || head == null){
            addAtBeginning(id,taskName,priority,dueDate);
            return;
        }

        int count =1;
        while(count <position-1 && temp.next != head){
           temp=temp.next;
           count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;

        if(temp == tail){
            tail=newTask;
        }
        System.out.println("Task added at the position "+position);
    }


    public void removeByTaskId(int id){
        Task temp = head , prev = tail;
        if (head ==tail&& head.id ==id){
            head =tail = null;
            System.out.println("Last task is removed, list is empty...");
            return;
        }
            while (temp.next != head && temp.id !=id){
                prev = temp;
                temp = temp.next;
            }
            if (temp.id != id){
                System.out.println("Task Id"+id+"not found");
                return;
            }
            if(temp == head){
                head = temp.next;
               prev.next=head;
            } else if (temp == tail) {
                prev.next = head;
                tail = prev;
            }
            else {
                prev.next = temp.next;
                temp = prev.next;
            }
        System.out.println("The Task of Task "+id+ " removed from list..");
    }
    public void viewAndMoveToNext() {
        Task current = head;
        if (current == null) current = head;
        if (current != null) {
            System.out.println("Current Task => ID: " + current.id + ", Name: " + current.taskName);
            current = current.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Task temp = head;
        System.out.println("All Tasks:");
        do {
            System.out.println("ID: " + temp.id + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(String priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }
        boolean found = false;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Found => ID: " + temp.id + ", Name: " + temp.taskName +
                        ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks with priority " + priority + " found.");
    }
}



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
