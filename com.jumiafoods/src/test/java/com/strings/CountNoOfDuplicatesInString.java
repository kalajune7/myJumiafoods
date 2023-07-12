package com.strings;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountNoOfDuplicatesInString 
{
	@Test
	public void countAlph() 
	{
		String s="Mahaballeshwara"; //a=5 h=2 l=2 
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
			if(count>1)
				System.out.print(c+"="+count+" ");
			
		}
	}

}
