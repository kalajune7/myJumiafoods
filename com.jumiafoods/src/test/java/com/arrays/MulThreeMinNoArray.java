package com.arrays;

public class MulThreeMinNoArray {

	/**
	 * Program to Multiply 3 minimum num in Array
	 * @author Manjunath Yadav
	 *
	 */

	public static void main(String[] args) 
	{
		int[] a= {1,7,5,2,4,8,6};  //24
		int fmin=a[0];
		int smin=a[0];
		int tmin=a[0];

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
			else if(a[i]<=smin) 
			{
				if(a[i]!=smin)
				{
				tmin=smin;
				}
				smin=a[i];
			}
			else if(smin==tmin || tmin>a[i])
			{
				tmin=a[i];
			}
		}
		System.out.println("1st Minimum No in Array is : "+fmin);
		System.out.println("2nd Minimum No in Array is : "+smin);
		System.out.println("3nd Minimum No in Array is : "+tmin);
		int mul=fmin*smin*tmin;
		System.out.println(mul);
	}
}
