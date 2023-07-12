package java;

abstract class ExAbstract 
{
	static int a=10;
	static int b=20;
	public ExAbstract()
	{
		this(10);
		System.out.println("Constructor without arg");
	}
	public ExAbstract(int a)
	{

		System.out.println("Constructor with arg- "+a);

	}
	public static void add()
	{
		int c=a+b;
		System.out.println(c+" -from static");
	}

	public void add1()
	{
		int c=b-a;
		System.out.println(c+" -from nonstatic");
	}

}
public class ExecuteAbstract extends ExAbstract
{
	public ExecuteAbstract()
	{
		super();
	}

	public static void main(String[] args)
	{
		ExAbstract.add();
		ExAbstract ab=new ExecuteAbstract();
		ab.add1();
	}
}