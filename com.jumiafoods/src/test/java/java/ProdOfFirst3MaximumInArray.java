package java;

/*
 * 2.Program {7,-3,0,2,1,-9} Without bubble sorting First 3 max element Product of Max 3 element
 */
public class ProdOfFirst3MaximumInArray 
{

	public static void main(String[] args) 
	{
		int a[]= {7,-3,0,2,1,-9};
		int fMax=a[0];
		int sMax=a[0];
		int tMax=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>=fMax)
			{
				if(a[i]!=fMax)
				{
					sMax=fMax;
				}
				fMax=a[i];
			}
			else if(a[i]>sMax || fMax==sMax)
			{
				if(a[i]!=sMax)
				{
					tMax=sMax;
				}
				sMax=a[i];
			}
			else if(a[i]>tMax || sMax==tMax)
			{
				tMax=a[i];
			}
		}
		System.out.println("First Maximum Num: "+fMax);
		System.out.println("Second Maximum Num: "+sMax);
		System.out.println("Third Maximum Num: "+tMax);
		int Prod=fMax*sMax*tMax;
		System.out.println(Prod);
	}

}
