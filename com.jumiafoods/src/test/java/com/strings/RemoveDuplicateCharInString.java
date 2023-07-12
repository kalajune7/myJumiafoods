package com.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInString 
{

	public static void main(String[] args)
	{
		String s="test Yantra"; //t e s   y a n r
		String str = s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}
		for (Character c : hs) 
		{
			System.out.print(c+" ");
		}
	}

}
