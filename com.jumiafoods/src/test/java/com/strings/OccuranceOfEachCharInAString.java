package com.strings;

import java.util.LinkedHashSet;

/**
 * Occurance of each Character in String
 * @author Manjunath Yadav
 *
 */
public class OccuranceOfEachCharInAString 
{

	public static void main(String[] args) 
	{
		String s="Mahaballeshwara"; //m=1 a=5 h=2 b=1 l=2 e=1 s=1 w=1 r=1
		String st=s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			hs.add(st.charAt(i));
		}
		for (Character c : hs) 
		{
			int count=0;
			for (int i = 0; i < st.length(); i++) 
			{
				if(c==st.charAt(i))
				{
					count++;
				}
			}
			System.out.print(c+" is repeating "+count+" times"+"  ");
			System.out.println(c+"="+count+" ");
		}
	}
}

