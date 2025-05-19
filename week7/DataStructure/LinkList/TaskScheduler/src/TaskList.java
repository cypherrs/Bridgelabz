class TaskList {
    Task head = null;
    Task tail = null;

    public void addAtEnd(int id, String taskName, String priority, int dueDate) {
        Task newTask = new Task(id, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;

        }
        System.out.println("New task is added.....");
    }

    public void addAtBeginning(int id, String taskName, String priority, int dueDate) {
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

    public void addAtPosition(int position, int id, String taskName, String priority, int dueDate) {
        Task newTask = new Task(id, taskName, priority, dueDate);
        Task temp = head;

        if (position <= 1 || head == null) {
            addAtBeginning(id, taskName, priority, dueDate);
            return;
        }

        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) {
            tail = newTask;
        }
        System.out.println("Task added at the position " + position);
    }


    public void removeByTaskId(int id) {
        Task temp = head, prev = tail;
        if (head == tail && head.id == id) {
            head = tail = null;
            System.out.println("Last task is removed, list is empty...");
            return;
        }
        while (temp.next != head && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.id != id) {
            System.out.println("Task Id" + id + "not found");
            return;
        }
        if (temp == head) {
            head = temp.next;
            prev.next = head;
        } else if (temp == tail) {
            prev.next = head;
            tail = prev;
        } else {
            prev.next = temp.next;
            temp = prev.next;
        }
        System.out.println("The Task of Task " + id + " removed from list..");
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
