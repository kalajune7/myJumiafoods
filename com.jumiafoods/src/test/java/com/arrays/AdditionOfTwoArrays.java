package com.arrays;

public class AdditionOfTwoArrays 
{

	public static void main(String[] args) 
	{
		int a[]= {2,4,3,5,9};
		int b[]= {1,2,5,8,2,5};	//{3,6,8,13,11,5}

		int length =a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for (int i = 0; i < length; i++) 
		{
			try 
			{
				int sum=a[i]+b[i];
				System.out.println(sum);

			}
			catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}

			}
		}
	}
}

