package com.strings;

public class ReverseTheWordsInString 
{

	public static void main(String[] args) 
	{
		String s="I am a Automation Engineer";  //I ma a noitamotuA reenignE 
		String [] str=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String st=str[i];
			for (int j = st.length()-1; j >=0; j--) 
			{
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
