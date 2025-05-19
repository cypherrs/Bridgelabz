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