package java;

import java.util.Iterator;
/*
 * 15.Find the length of the String without using length method
 */
public class FindLengthWithoutMethod 
{
	public static void main(String[] args) 
	{
		String s = "Bengaluru";
		char[] charArray = s.toCharArray();
		int length = 0;
		for(char c : charArray){
		    length++;
		}
		System.out.println(length);
		
	}

}
