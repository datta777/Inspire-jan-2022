
public class A 
{
	public A ()
	{
		this(4);
		System.out.println("This is default constructor of class A");
	}

	public A (int a)
	{
		this (4,"java");
		System.out.println("This is my one parameter constructor of class A");
	}
	
	public A (int a, String s)
	{
		System.out.println("This is my two parameter constructor of class A");
	}
}
