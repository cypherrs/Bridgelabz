import java.util.Scanner;

//create class StudentGradeCalculator
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three subjects
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 3.0);

        // Determine grade and remarks
        String grade, remarks;
        if (percentage >= 80) {
			grade = "A";
            remarks = "Level 4,above agency-normalization standards";
        } else if (percentage >= 70 && percentage<= 79) {
            grade = "B";
            remarks = "Level 3,at agency-normalization standards";
        } else if (percentage >= 60 && percentage <= 69) {
            grade = "C";
            remarks = "Level 2,below , but approaching agency-normalization standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1,well below agency-normalization standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1,too below agency-normalization standards";
        }  else {
           grade = "R";
            remarks = "Remedial standards";
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}

