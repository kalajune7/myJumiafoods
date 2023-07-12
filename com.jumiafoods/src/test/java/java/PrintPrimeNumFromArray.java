package java;

public class PrintPrimeNumFromArray {

	public static void main(String[] args) {
		int []a= {1,3,2,4,6,5,9,7};
		
		for(int i=0;i<a.length;i++)
		{
			boolean isPrime = true;
			int n = a[i];
			for(int j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime && a[i]!=1)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
