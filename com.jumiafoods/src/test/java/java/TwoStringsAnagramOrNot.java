package java;

import java.util.Arrays;

public class TwoStringsAnagramOrNot {

	public static boolean isAnagram(String str1, String str2) {
		
		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
	    // Convert both strings to character arrays
	    char[] charArray1 = str1.toCharArray();
	    char[] charArray2 = str2.toCharArray();
	    
	    // Sort the character arrays
	    Arrays.sort(charArray1);
	    Arrays.sort(charArray2);
	    
	    // Compare the sorted arrays
	    return Arrays.equals(charArray1, charArray2);
	}
	public static void main(String[] args) {
	// Example usage
	String str1 = "listen";
	String str2 = "silent";
	if(isAnagram(str1, str2)) {
	    System.out.println(str1 + " and " + str2 + " are anagrams.");
	} else {
	    System.out.println(str1 + " and " + str2 + " are not anagrams.");
	}

	}	

}

//String str1 = "listen";
//String str2 = "silent";
//    // Convert both strings to character arrays
//    char[] charArray1 = str1.toCharArray();
//    char[] charArray2 = str2.toCharArray();
//    
//    // Sort the character arrays
//    Arrays.sort(charArray1);
//    Arrays.sort(charArray2);
//    
//    boolean res = Arrays.equals(charArray1, charArray1);
//
//    
//// Example usage
//
//if(res==true) {
//    System.out.println(str1 + " and " + str2 + " are anagrams.");
//} else {
//    System.out.println(str1 + " and " + str2 + " are not anagrams.");
//}
