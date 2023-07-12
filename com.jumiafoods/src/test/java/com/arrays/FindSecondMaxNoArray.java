package com.arrays;

public class FindSecondMaxNoArray 
{


	/**
	 * Program to find the 2nd Max No in Array
	 * @author Manjunath Yadav
	 *
	 */

	public static void main(String[] args) 
	{
		int[] a= {11,6,2,4,19,3,8};
		int fmax=a[0];
		int smax=a[0];

		for (int i = 0; i < a.length; i++) 
		{

			if(fmax<=a[i])
			{
				if(a[i]!=fmax)
				{
				smax=fmax;
				}
				fmax=a[i];
			}
			else if(fmax==smax || a[i]>smax) 
			{
				smax=a[i];
			}


		}
		System.out.println("1st Maximum No in Array is : "+fmax);
		System.out.println("2nd Maximum No in Array is : "+smax);
	}
}






