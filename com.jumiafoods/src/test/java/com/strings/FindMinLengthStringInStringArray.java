package com.strings;

public class FindMinLengthStringInStringArray {

	public static void main(String[] args) {
		String[] s= {"manj","man","manoj","mj","manju","pk"}; //mj pk
		String minLen=s[0];
		for (int i = 0; i < s.length; i++) {
				if(minLen.length()>s[i].length())
				{
					minLen=s[i];
				}
		}
		for (int i = 0; i < s.length; i++) {
		
			if(minLen.length()==s[i].length())
			{
				System.out.print(s[i]+" ");
			}
		}	
	}
}
