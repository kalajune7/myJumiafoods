package com.strings;

public class CountNoOfUpperAndLowerCaseLetters 
{

	public static void main(String[] args) 
	{
		String s="AuTomaTiOn";//UpperCase 4	LowerCase 6
		int upper=0;
		int lower=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				lower++;
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				upper++;
		}
		System.out.println("UpperCase "+upper);
		System.out.println("LowerCase "+lower);
	}

}
