package com.strings;

public class FindMaxLengthStringInStringArray {

	public static void main(String[] args) {
		String[] s= {"manjunath","man","manoj","mj","manj","pk"};
		String minLen=s[0];
		for (int i = 0; i < s.length; i++) {
				if(minLen.length()<s[i].length())
				{
					minLen=s[i];
				}
		}
		for (int i = 0; i < s.length; i++) {
		
			if(minLen.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
		
		
	}

}
