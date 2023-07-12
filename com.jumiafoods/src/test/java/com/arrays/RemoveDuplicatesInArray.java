package com.arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray 
{

	public static void main(String[] args) 
	{
		int [] a= {7,3,7,3,2,4};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for (Integer in : set) 
		{
			System.out.print(in+" ");
		}
	}

}
