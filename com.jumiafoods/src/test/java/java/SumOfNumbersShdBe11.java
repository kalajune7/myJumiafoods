package java;
/*
 * 9.I/P:{1,3,5,2,8,9,10}; print combination of numbers, sum of numbers should be 11 
 */

public class SumOfNumbersShdBe11 {

	public static void main(String[] args) {

		int a[] = {1,3,5,2,8,9,10};
		for(int i= 0 ; i<a.length ; i++)
		{
			for(int j=0 ; j<a.length ; j++)
			{
				if((a[i]+a[j])==11)
				{
					int sum=a[i]+a[j];
					System.out.println(a[i]+"+"+a[j]+"="+sum);
				}
			}
		}
	}

}
