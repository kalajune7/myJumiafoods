package com.arrays;

public class FindSecondMinNoArray 
{


	/**
	 * Program to find the 2nd Min No in Array
	 * @author Manjunath Yadav
	 *
	 */

	public static void main(String[] args) 
	{
		int[] a= {1,2,5,6,9,1,3};
		int fmin=a[0];
		int smin=a[0];

		for (int i = 0; i < a.length; i++) 
		{

			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
				smin=fmin;
				}
				fmin=a[i];
			}
			else if(fmin==smin || smin>a[i]) 
			{
				smin=a[i];
			}
		}
		System.out.println("1st Minimum No in Array is : "+fmin);
		System.out.println("2nd Minimum No in Array is : "+smin);
	}
}






