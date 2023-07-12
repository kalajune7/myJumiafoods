package com.strings;

import java.util.LinkedHashSet;

public class CountNoOfVowelsInStringWithoutDuplicates {

	public static void main(String[] args) {

		String st="testYantra";//ea=2
		String s = st.toLowerCase();
		char[] sa = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < sa.length; i++) {
			set.add(sa[i]);
		}
		int count=0;
		for (Character ch:set) 
		{
			if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				System.out.print(ch);
			}
		}
		System.out.println("="+count);
	}

}
