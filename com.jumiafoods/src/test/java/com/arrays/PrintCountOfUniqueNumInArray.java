package com.arrays;

import java.util.LinkedHashSet;

public class PrintCountOfUniqueNumInArray 
{

	public static void main(String[] args) 
	{
		int [] a= {4,5,9,1,5,3,2};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		int ucount=0;
		for (Integer in : set) 
		{
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(in==a[i])
				{
					count++;
				}
			}

			if(count==1)
				ucount++;
			
		}
		System.out.println(ucount);
		
	}
}

