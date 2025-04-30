import java.util.Scanner;

class EligibleForVote{
	public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter no. of students: ");
	int numOfStudents = input.nextInt();
	
	int[] ageOfStudent = new int[numOfStudents];
	System.out.println ("Enter the age of students : ");
	
	for(int i =0 ; i< numOfStudents;i++){
		ageOfStudent[i] = input.nextInt();
	}
	
	for(int i =0 ; i< numOfStudents;i++){
		if (ageOfStudent[i] >= 18){
			System.out.println("The student with the age can vote..");
		}else{
			System.out.println("student "+i+"is not eligible for vote..");
		}
	}
	}	
}