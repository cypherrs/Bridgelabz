package StudentReport.src;


public class MainStudentReport{
	public static void main(String[] args){
		StudentReport student1 = new StudentReport("samji",123456,46);
		StudentReport student2 = new StudentReport("kamji",3122,86);
		student1.displayDetails();
		student2.displayDetails();
	}
}