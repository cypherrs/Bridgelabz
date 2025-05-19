class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void displayPostDetail() {
        System.out.println("Rollnumber : " + rollNumber);
        System.out.println("Name of student : " + name);

        System.out.println("==========================");
    }
}
