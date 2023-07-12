package com.strings;

public class SegregateAlphaNumAndSpecChars {

	public static void main(String[] args) {


		String st="a2B3?d*K"; //aBdK 23 ?*
		char[] sa = st.toCharArray();
		String alpha="";
		String num="";
		String spc="";
		for (int i = 0; i < sa.length; i++) 
		{
			if(sa[i]>='a' && sa[i]<='z' || sa[i]>='A' && sa[i]<='Z' )
			{
				alpha=alpha+sa[i];
			}
			else if(sa[i]>='0' && sa[i]<='9')
			{
				num=num+sa[i];
			}
			else
			{
				spc=spc+sa[i];
			}
		}
		System.out.println(alpha+" "+num+" "+spc);
	}

}
