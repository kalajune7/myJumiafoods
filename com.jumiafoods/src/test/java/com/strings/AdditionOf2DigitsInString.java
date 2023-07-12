package com.strings;

public class AdditionOf2DigitsInString 
{

	public static void main(String[] args) 
	{
//		String st="c15m12p4n1"; //o/p = 31
//		int sum=0;
//		int tsum=0;
//		for (int i = 0; i < st.length(); i++) 
//		{
//			if(st.charAt(i)>='0' && st.charAt(i)<='9')
//			{
//				int n=st.charAt(i)-48;
//				tsum=tsum*10+n;
//			}else
//			{
//				sum=sum+tsum;
//				tsum=0;
//			}
//		}
//		sum=sum+tsum;
//		System.out.println(sum);
		
		
		
		//**********????///////
//	String[] arr = st.split("[^0-9]"); //split the string by non-digits
//	for(String num : arr) {
//	    if(num.length() > 0) //if the string is not empty
//	        sum=sum+ Integer.parseInt(num);
//	   }
//	System.out.println(sum);
		
		
		
		
		//***easy method***//
		
	String s="s12h76j";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		char st = s.charAt(i);
		if(st>='0'  && st<='9')
		{
			int n=st-48;//0 ascii is 48 example..for 1= 49 i.e 49-48=1
			sum=sum+n;
		}
		
		
	}
		
	System.out.println(sum);	
		
		
	}

}



