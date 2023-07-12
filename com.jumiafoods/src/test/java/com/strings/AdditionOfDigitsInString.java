package com.strings;

public class AdditionOfDigitsInString {

	public static void main(String[] args) {

		String st="a2B3?d8*K"; //aBdK 23 ?*
		char[] sa = st.toCharArray();
		int sum=0;
		for (int i = 0; i < sa.length; i++) {
			if(sa[i]>='0' && sa[i]<='9')
			{
				int n=st.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
		
	}

}
