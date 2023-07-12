package com.strings;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		String s="appajappa"; //appajappa
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			System.out.println(s+" is a Palindrome");
		else
			System.out.println(s+" is not Palindrome");
	}

}
