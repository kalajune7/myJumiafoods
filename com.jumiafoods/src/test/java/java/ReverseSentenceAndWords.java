package java;

import java.util.Iterator;

/*
 * 11.Java program for I/p=my name is ok and o/p=ko si eman ym
 */
public class ReverseSentenceAndWords 
{

	public static void main(String[] args) 
	{
		String s = "my name is ok"; //ko si eman ym
		String[] st = s.split(" ");
		for (int i = st.length-1; i>=0 ; i--) 
		{
			String str = st[i];
			for (int j = str.length()-1; j>=0 ; j--) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
