package java;

import java.util.Scanner;

public class GivenNumIsPrimeOrNot {

	public static void main(String[] args) 
	{
		for(;;) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			
			int n=sc.nextInt();
			boolean isPrime = true;
			if(n==0 || n==1)
			{
				isPrime=false;
			}
			else 
			{
				for (int i = 2; i <=n/2; i++) 
				{
					if(n%i==0)
					{
						isPrime=false;
						break;
					}
				}
			}
			if(isPrime==true) 
			{
				System.out.println(n+" is a prime number");
			}
			else
			{
				System.out.println(n+" is not a prime number");
			}
			System.out.println();
		}
	}

}
