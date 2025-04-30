
// Create PenDistribution Class to calculate  pens each student will 
//get if the pens must be divided equally
public class PenDistribution {
    public static void main(String[] args) {
		
		//Create variable numberOfPenand student and assign the value 1 and value 2.
        int numberOfPen = 14, student = 3;

		//Create variable penPerStudent to calculate the number of pen distributed equaly.
        int penPerStudent = numberOfPen / student;
		
		//Create variable remainingPen to calculate undistributed pen
        int remainingPen = numberOfPen % student;
		
		//Print the penPerStudent and undistributed pen.
        System.out.println("The Pen Per Student is " + penPerStudent + 
		" and the remaining pen not distributed is " + remainingPen) ;
    }
}
