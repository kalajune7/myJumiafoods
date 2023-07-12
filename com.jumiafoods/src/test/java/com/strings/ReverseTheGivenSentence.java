package com.strings;

public class ReverseTheGivenSentence {

	public static void main(String[] args) 
	{
		String s="I am a Automation Engineer"; //Engineer Automation a am I
		String [] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			String rev=str[i];
			System.out.print(rev+" ");
		}
		
		System.out.println();
		//Remove the space between Strings   //EngineerAutomationaamI
		String [] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}
		
	}

}
