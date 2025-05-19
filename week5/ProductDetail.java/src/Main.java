package ProductDetail.java.src;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(123,"rupkumar",8.9);
        System.out.println("Hello, World!");
        s1.displaydetails();

        System.out.println("Updated CGPA: " + s1.getCGPA());
        s1.setCGPA(9);
        s1.displaydetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 8.8);
        pgStudent.displayPostDetail();
        pgStudent.displaydetails();
    }
}