package java;

/*
 * 12. "I love programming" reverse n split o/p: I evol gnimmargorp
 */
public class ReverseAndSplit {

	public static void main(String[] args) {
		String s = "I love programming";  //I evol gnimmargorp
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) 
		{
			String str=st[i];
			for (int j = str.length()-1; j>=0 ; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
