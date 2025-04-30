import java.util.Scanner;

public class StringVerification{
	
    // Method to compare two strings character by character
	public static boolean comparestring(String str1 , String str2){
		if (str1.length() != str2.length()){
			return false;
		}
		
		for (int i =0; i< str1.length() ; i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String string1 = input.next();
		
		System.out.println("Enter second string: ");
		String string2 = input.next();
		
		// Comparing strings manually using charAt()
		boolean customComprition = comparestring(string1 ,string2);
		
		// Comparing strings manually using equals() metod
		boolean builtinComparition = string1.equals(string2) ;
		
		// printing the results
		System.out.println("Comparison using charAt() : " + customComprition);
		System.out.println("Comparison using equals() : " + builtinComparition);
		
		 // Checking if both methods give the same result
		System.out.println("Do obth methods give the same result " + (customComprition == builtinComparition));
		 input.close();
	}
}