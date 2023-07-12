package com.arrays;

/**
 * Program to sort the Array in Decending Order
 * @author Manjunath Yadav
 *
 */

public class BubbleSortDecendingArray 
{
	public static void main(String[] args) 
	{
		int[] a= {5,6,0,9,1,3};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}	
			System.out.println(a[i]);	
		}
//		for (int k = 0; k < a.length; k++) 
//		{
//			System.out.print(a[k]+" ");
//		}
	}
	
}
