package com.strings;

import java.util.LinkedHashSet;

public class PositionOfEachCharInaStringWithoutDuplicates {

	public static void main(String[] args) 
	{
		String s="Manjunath";
		String st = s.toLowerCase();
//		for (int i = 0; i < st.length(); i++) 
//		{
//			System.out.println(st.charAt(i)+" is at Position "+i);
//		}
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) 
		{
			set.add(st.charAt(i));
		}
		for (Character ch : set) 
		{
			for(int i=0;i<st.length();i++)
//			for (int i = st.length()-1; i >=0 ; i--) //PositionOfEachCharInReverseOrderOfStringWithoutDuplicates
			{
				if(ch==st.charAt(i))
				{
					System.out.println(ch+" is Present in "+(i+1)+" position");
					break;
				}
			}
			
		}
	}

}
