package com.strings;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordsInString 
{

	public static void main(String[] args) 
	{
		String s="Hi bro Hi bro I am Fine";
		String[] st = s.split(" ");
		LinkedHashSet< String> set = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
		}
		for (String str : set)
		{
			int count=0;
			for(int i=st.length-1;i>=0;i--)
			{
				if(str.equals(st[i]))
				{
					count++;
				}
			}
			System.out.println(str+" = is repeating "+count+" times");
		}
	}

}
