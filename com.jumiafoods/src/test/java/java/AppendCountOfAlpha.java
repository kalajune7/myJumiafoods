package java;

import java.util.LinkedHashSet;

/**
 * java programs I/P- aaabbcdddf :O/P a3b2cd3f
 * @author Manjunath Yadav
 *
 */
public class AppendCountOfAlpha 
{

	public static void main(String[] args) 
	{
		String s="aaabbcdddf";  //a3b2cd3f
		String st=s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			hs.add(st.charAt(i));
		}

		for (Character c : hs) 
		{
			int count=0;
			for (int i = 0; i < st.length(); i++) 
			{
				if(c==st.charAt(i))
				{
					count++;

				}
			}
			if(count>1)
				System.out.print(c+""+count);
			else
				System.out.print(c);
		}

	}

}

