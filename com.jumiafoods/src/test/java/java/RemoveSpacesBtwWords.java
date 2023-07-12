package java;

/*
 * 10.Java Program for I/p= my name is abc and O/p= mynameisabc
 */
public class RemoveSpacesBtwWords 
{
	public static void main(String[] args) {
		String s = "my name is abc";
		String[] st = s.split(" ");
		String str = "";
		for (int i = 0; i < st.length; i++) {
			str=str+st[i];
			
		}
		System.out.println(str);
	}

}
