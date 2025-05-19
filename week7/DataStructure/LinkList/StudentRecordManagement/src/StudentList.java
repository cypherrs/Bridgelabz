class StudentList {
    private StudentNode head;

    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(roll, name, age, grade);

        newStudent.next = head;
        head = newStudent;
        System.out.println("Student added at beginning..");
    }

    public void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newStudent;
            System.out.println("Student added at the end (was empty list)..");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newStudent;
        System.out.println("Student added at end.");
    }

    public void addAtPosition(int position, int roll, String name, int age, String grade) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            addAtBeginning(roll, name, age, grade); // use addAtBeginning if position is 1
            return;
        }

        StudentNode newStudent = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next; // move to (position-1)th node
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newStudent.next = temp.next; // insert new node between temp and temp.next
        temp.next = newStudent;
        System.out.println("Student added at position " + position + ".");
    }

    public void deleteByRoll(int roll) {
        StudentNode temp = head, prev = null;

        // Search for the student with the given roll number
        while (temp != null && temp.roll != roll) {
            prev = temp;
            temp = temp.next;
        }

        // If student not found
        if (temp == null) {
            System.out.println("Student not found.");
            return;
        }

        // If student is at the head
        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next; // bypass the node to delete it
        }
        System.out.println("Student with roll " + roll + " deleted.");
    }

    public void searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                // Student found, print details
                System.out.println("Found: Roll: " + temp.roll + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        // Student not found
        System.out.println("Student not found.");
    }

    // Update grade of a student by roll number
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Old Grade: " + temp.grade);
                temp.grade = newGrade; // update grade
                System.out.println("Updated Grade for roll " + roll + " to " + newGrade);
                return;
            }
            temp = temp.next;
        }
        // Student not found
        System.out.println("Student not found.");
    }

    // Display all student records in the list
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        StudentNode temp = head;
        System.out.println("\nAll Student Records:");
        while (temp != null) {
            // Print each student record
            System.out.println("Roll: " + temp.roll + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}
