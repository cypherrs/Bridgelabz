import java.util.Scanner;

class Student{
     String name;
     int roll;
     String grade;
     int age;

    Student next;

    public Student(int roll,String name,int age,String grade){
        this.name=name;
        this.age = age;
        this.roll = roll;
        this.grade =grade;
        this.next = null;
    }
}

class StudentList{
    private Student head;

    public void addAtBeginning(int roll,String name,int age,String grade){
        Student newStudent= new Student(roll, name, age, grade);

        newStudent.next = head;
        head = newStudent;
        System.out.println("Student added at beginning...");
    }

    public void addAtEnd(int roll,String name,int age,String grade){
        Student  newStudent =new Student(roll, name, age, grade);

        if (head == null){
            head = newStudent;
            System.out.println("Student is added at the beginnnig...");
        }

        Student temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newStudent;
        System.out.println("Student is added at the end..");

    }

    public void addAtPosition(int position,int roll,String name,int age,String grade){
        if (position<= 0){
            System.out.println("invalid position....");
        }
         if (position == 1){
            addAtBeginning(roll, name, age, grade);
            return;
         }

         Student newStudent = new Student(roll, name, age, grade);
         Student temp = head;

         for(int i=1 ; i< position-1 && temp != null; i++){
             temp = temp.next;
         }
         if (temp== null){
             System.out.println("Position out of bound.....");
             return;
         }
         newStudent.next = temp.next;
         temp.next = newStudent;
        System.out.println("Student is added at the position " +position+" . ");

    }
    public void deleteByRoll(int roll){
        Student temp= head, prev = null;

        while (temp != null && temp.roll != roll ){
            prev = temp;
            temp = temp.next;
        }

        if (temp == null){
            System.out.println("Student was not found....");
            return;
        }
        if (prev== null){
            head =temp.next;
        }else{
            prev.next = temp.next;
        }
        System.out.println("Student of roll number "+roll+" deleted..");
    }

    public void selectByRoll(int roll){
        Student temp = head;
        while(temp != null){
            if(temp.roll == roll ){
                System.out.println("Found: Roll: " + temp.roll + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    public void updateByRollGrade(int roll,String newGrade){
        Student temp = head;
        while(temp != null){
            if (temp.roll == roll){
                System.out.println("Old Grade: " + temp.grade);
                temp.grade = newGrade;
                System.out.println("Student of the roll number: "+ temp.roll+" hav updated the grade to "+temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student was not found  ..");
    }

    public void displayAll(){
        if (head == null){
            System.out.println("no student was found...");
            return;
        }
        Student temp = head;
        System.out.println("Student All Records ");
        while(temp != null){

            System.out.println("Roll: " + temp.roll + ", Name: " + temp.name +" , Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }

    }
}



public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;


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
            sc.nextLine();

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
                    list.selectByRoll(roll);
                    break;

                case 6:
                    System.out.print("Enter Roll Number to Update Grade: ");
                    roll = sc.nextInt();
                    System.out.print("Enter New Grade: ");
                    grade = sc.next();
                    list.updateByRollGrade(roll, grade);
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
        } while (choice != 8);

        sc.close();
    }
}