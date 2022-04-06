
public class B extends A
{
	
public B()
{
	super ();
	System.out.println("This is my default constructor of class B");
}

public B (int a)
{
	this();
	System.out.println("This is my one parameter constructor of class B");
}

public static void main (String args[])
{
	B a= new B(4);
}
}
