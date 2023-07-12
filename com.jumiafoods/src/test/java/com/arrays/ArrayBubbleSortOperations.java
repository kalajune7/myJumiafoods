package com.arrays;

public class ArrayBubbleSortOperations 
{
	public static void main(String[] args) 
	{
		int[] a= {5,-6,2,9,1,3};
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
		}
//		System.out.println(a[1]);	//	2nd minimum and maximum in a Array
//		System.out.println(a[a.length-1]); //last min and maximum
//		int sum=0;
//		for (int k = 0; k < 3; k++) {
//			sum=a[k]+sum;
//		}
//		System.out.println(sum); //sum of 1st 3 max and min
		
		int mul=1;
		for (int l = 0; l < 3; l++) {
			mul=a[l]*mul;
		}
		System.out.println(mul); //mul of 1st 3 max and min
	}
}