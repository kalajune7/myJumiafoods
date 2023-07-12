package java;

import java.util.LinkedHashSet;
/*
 * 6.Write Program to print count of characters I/p: aweexxxyyyyyy
 * 7. Write a java program for i/p: "Malayalam"  O/p: m:2 a:4 l:2 y:1
 */
public class CountOfCharacters {

	public static void main(String[] args) {
		
		String s="Malayalam"; //a=1;w=1,e=2,x=3,y=6 //m:2 a:4 l:2 y:1 
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
				System.out.print(c+":"+count+" ");
			
		}
	}

}
