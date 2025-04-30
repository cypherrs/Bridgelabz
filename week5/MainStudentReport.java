class StudentReport{
	
	 String name; 
	 int rollNumber;
	 int marks;
	
	public StudentReport(String name,int rollNumber,int marks){
		this.name=name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
		System.out.println(" ");
    }
}
	


public class MainStudentReport{
	public static void main(String[] args){
		StudentReport student1 = new StudentReport("samji",123456,46);
		StudentReport student2 = new StudentReport("kamji",3122,86);
		student1.displayDetails();
		student2.displayDetails();
	}
}