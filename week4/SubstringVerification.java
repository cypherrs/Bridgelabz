import java.util.Scanner;

public class SubstringVerification{

    public static String customSubstring(String text, int start,int end){
		StringBuilder result = new StringBuilder();
		
		for (int i= start;i< end;i++){
			result.append(text.charAt(i));
		}
        return result.toString();
    }
	
	
	public static boolean compareStringUsingCharAt(String str1 , String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0; i< str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String mainString = input.next();
		
		System.out.println("Enter the start index :");
		int startindex = input.nextInt();
		
		System.out.println("Enter the end index :");
		int endindex = input.nextInt();
		
		String substringusingCharat = customSubstring(mainString , startindex,endindex);
		String buildinSubstring = mainString.substring(startindex,endindex);
		
		boolean areEqual = compareStringUsingCharAt(substringusingCharat,buildinSubstring);
		
		System.out.println("Substring using carat method: "+ substringusingCharat);
		System.out.println("Substring using build-in method: " + buildinSubstring);
		System.out.println("are they both equal? "+areEqual);
		
		input.close();
	}
}