package xpathpractice;

import java.util.ArrayList;
import java.util.Collections;

public class Highestword {
public static void main(String[] args) {
	String s="i am kala  ";
	String[] s1=s.split(" ");
	ArrayList<Integer> ar =new ArrayList<Integer>();
	for(int i=0;i<s1.length;i++)
	{
		ar.add(s1[i].length());
		
	}
	Collections.sort(ar);
	System.out.println(ar);
	for(int i=0;i<s1.length;i++)
	{
		if(ar.get(0)==s1[i].length())
		{
			System.out.println("lowest is"+s1[i]);
		}
		else {
			if(ar.get(ar.size()-1)==s1[i].length())
			{
				System.out.println("greatest is"+s1[i]);
			}
		
			
		}
	}
	
	}
	
	
}


