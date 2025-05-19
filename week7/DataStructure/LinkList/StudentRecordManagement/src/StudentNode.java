class StudentNode {
    //this are my student node data
    int roll;
    String name;
    int age;
    String grade;

    //this point to next student...
    StudentNode next;


    public StudentNode(int roll, String name, int age, String grade) {

        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
