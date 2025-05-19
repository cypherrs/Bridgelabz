package ProductDetail.java.src;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displaydetails() {
        System.out.println("Rollnumber : " + rollNumber);
        System.out.println("Name of student : " + name);
        System.out.println("cgpa: " + cgpa);
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
