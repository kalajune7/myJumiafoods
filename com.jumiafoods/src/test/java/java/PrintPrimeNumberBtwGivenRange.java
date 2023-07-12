package java;

import java.util.Scanner;
/*
 * 5.Write a Program to print 1 to 100 prime num.
 */

public class PrintPrimeNumberBtwGivenRange 
{

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Range");
//		int n = sc.nextInt();
		int n=100;
		for (int i = 2; i <=n; i++)
		{
			boolean rs = isPrime(i);
			if(rs) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
}
