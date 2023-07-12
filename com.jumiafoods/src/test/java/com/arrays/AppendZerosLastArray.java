package com.arrays;

public class AppendZerosLastArray {

	public static void main(String[] args) 
	{
		int[] a= {5,-6,0,9,0,3,0};  //{5,6,9,3,0,0,0}
		int[] b= new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n--;
			}

		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}





		//		for (int i = 0; i < a.length; i++) 
		//		{
		//			for (int j = i+1; j < a.length; j++) 
		//			{
		//				if(a[i]==0)
		//				{
		//					int temp=a[i];
		//					a[i]=a[j];
		//					a[j]=temp;
		//				}
		//			}
		//			System.out.print(a[i]+" ");
		//		}

	}

}



