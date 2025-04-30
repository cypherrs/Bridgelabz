import java.util.Scanner;
import java.util.Arrays;

public class CharacterArrayComparision{

	// Method to return all characters in a string without using toCharArray
    public static char[] getCharactersFromString(String text){
		char[] character = new char[text.length()];
		
		
		for (int i=0;i<text.length();i++){
			character[i] = text.charAt(i);
		}
		return character;
    }
	
	
	public static boolean compareCharrecterArray(char[] array1 , char[] array2){
		return Arrays.equals(array1,array2);
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String mainString = input.next();
		
		char[] userDefinedArray = getCharactersFromString(mainString);
        char[] builtInArray = mainString.toCharArray();
		
		boolean areEqual = compareCharrecterArray(userDefinedArray, builtInArray);
		
		System.out.println("Character array using user-defined method: " + Arrays.toString(userDefinedArray));
        System.out.println("Character array using built-in toCharArray() method: " + Arrays.toString(builtInArray));
        System.out.println("Are both character arrays equal? " + areEqual);
		
		input.close();
	}
}