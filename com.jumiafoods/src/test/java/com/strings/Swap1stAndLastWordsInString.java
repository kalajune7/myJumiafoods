package com.strings;

public class Swap1stAndLastWordsInString 
{

	public static void main(String[] args) 
	{
		String s="I am a Automation Engineer";   //Engineer am a Automation I 
		String [] str=s.split(" ");
			String temp=str[0];
			str[0]=str[str.length-1];
			str[str.length-1]=temp;
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i]+" ");	
			}
			
		}
			
	}

