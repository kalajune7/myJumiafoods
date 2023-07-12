package com.arrays;

/**
 * Program to find the 1st Max No in Array
 * @author Manjunath Yadav
 *
 */
public class FindFirstMaxNoArray {

	public static void main(String[] args) 
	{
		int[] a= {1,4,-2,5,-9};
		int max=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("1st Minimum No in Array is : "+max);
	}
}
