package com.strings;

public class ReverseString 
{

	public static void main(String[] args) 
	{
//		//Normal way-1
//		String s="software";
//		for (int i =s.length()-1 ; i>=0 ; i--) 
//		{
//			System.out.print(s.charAt(i)+"");
//		}
		
		
		//Using 3rd Variable-2
//		String s="test engineer";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev+"");
		
//		//Using toCharArray-3
//		String s="testYantra";
//		char[] str=s.toCharArray();
//		for (int i = str.length-1; i >=0 ; i--) 
//		{
//			System.out.print(str[i]+"");
//		}
		
//		//Using var count-4
//		String s="developer";
//		char[] str=s.toCharArray();
//		int count=0;
//		for(char c:str)
//		{
//			count++;
//		}
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.println(str[i]);
//		}
		
		//Using String Builder
		StringBuffer buffer=new StringBuffer();
		StringBuilder build=new StringBuilder("scrumTeam");
		System.out.println(build.reverse());
		System.out.println(build.capacity());
		System.out.println(build.length());
		System.out.println(build.append("rmg"));
		
	}

}
