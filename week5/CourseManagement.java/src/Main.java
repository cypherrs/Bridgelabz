class Course {
    private String courseName;
    private double duration;
    private double fee;
    private static String instituteName = "SRMIST";

    public Course(String courseName, double duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;

    }

    public void displayCourseDetail() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course name : " + courseName);
        System.out.println("Course name : " + duration);
        System.out.println("Course name : " + fee);

    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }


}




public class Main {
    public static void main(String[] args){
    Course course1 = new Course("Java Programming", 6, 500);
    Course course2 = new Course("Data Science", 12, 1200);

    // Displaying initial course details
        System.out.println("Before updating institute name:\n");
        course1.displayCourseDetail();
        System.out.println();
        course2.displayCourseDetail();
        System.out.println();

    // Updating the institute name
        Course.updateInstituteName("XYZ Academy");

    // Displaying course details after update
        System.out.println("After updating institute name:\n");
        course1.displayCourseDetail();
        System.out.println();
        course2.displayCourseDetail();
}
}