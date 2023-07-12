package java;

/*
 * 8.Program to find sum of first three minimum elements a= {7,-6,11,9,0,4}; of array ->
 */
public class SumOfFirst3MinInArray {

	public static void main(String[] args) {
		int[] a= {7,-6,11,9,0,4};  
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
		int sum=fmin+smin+tmin;
		System.out.println(sum);
	}

}
