class Student{
    public int rollNumber;
    protected  String name;
    private double  cgpa;

    public Student(int rollNumber,String name,double cgpa){
        this.rollNumber= rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }

    public void displaydetails(){
        System.out.println("Rollnumber : "+rollNumber);
        System.out.println("Name of student : "+name);
        System.out.println("cgpa: "+cgpa);
        System.out.println("==========================");

    }


    // Public method to access CGPA (getter)
    public double getCGPA() {
        return cgpa;
    }

    // Public method to modify CGPA (setter)
    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0 and 10.");
        }
    }
}

class PostgraduateStudent extends Student{

    public PostgraduateStudent(int rollNumber,String name,double cgpa){
        super(rollNumber,name,cgpa);
    }

    public void displayPostDetail(){
        System.out.println("Rollnumber : "+rollNumber);
        System.out.println("Name of student : "+name);

        System.out.println("==========================");
    }
}


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