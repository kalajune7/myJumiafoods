package com.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) 
	{
		String s="Hi bro Hi bro I am Fine";
		String[] st = s.split(" ");
		LinkedHashSet< String> set = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
		}
		for (String str : set) {
			System.out.print(str+" ");
		}
	}

}
