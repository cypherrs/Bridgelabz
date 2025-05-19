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
