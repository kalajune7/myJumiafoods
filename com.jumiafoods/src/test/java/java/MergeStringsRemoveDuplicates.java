package java;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
 * 14. String s="This is fun show";
 * 		String s1="fun tv show";
 * 	o/p: this is tv
 */

public class MergeStringsRemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String s="This is fun show";
		String s1="fun tv show";
		String merge=s+" "+s1;
		String lwrCase = merge.toLowerCase();
		String[] str = lwrCase.split(" ");
		LinkedList<String> list=new LinkedList<String>();
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		for (String word : list) 
		{
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			if(count<2)
				System.out.print(word+" ");
		}
		
		
	}

}
