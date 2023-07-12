package com.arrays;

public class FindFirstMinNoArray 
{


	/**
	 * Program to find the 1st Min No in Array
	 * @author Manjunath Yadav
	 *
	 */

	public static void main(String[] args) 
	{
		int[] a= {1,6,2,9,8,3};
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(min>a[i])
			{
				min=a[i];
			}

		}
		System.out.println("1st Minimum No in Array is : "+min);
	}

}			



