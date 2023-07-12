package com.arrays;

import java.util.LinkedHashSet;

public class CountDuplicatesInArray 
{

	public static void main(String[] args) 
	{
		int [] a= {4,5,4,1,5,3,2};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer in : set) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(in==a[j])
				{
					count++;
				}
				
			}
			System.out.println(in+"="+count);
		}
	}

}
