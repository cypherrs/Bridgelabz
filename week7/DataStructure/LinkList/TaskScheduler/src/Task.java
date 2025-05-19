class Task {
    int id;
    String taskName;
    String priority;
    int dueDate;

    Task next;

    public Task(int id, String taskName, String priority, int dueDate) {
        this.id = id;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }

}
