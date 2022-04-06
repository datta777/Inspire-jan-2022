// calling default and parameter constructor

class Demo4
{

public Demo4()
{
System.out.println("This is default constructor");
}

public Demo4(int a)
{
System.out.println("This is parameter constructor");
}

public static void main(String args[])
{
System.out.println("This is my main method");
Demo4 d=new Demo4();
Demo4 f=new Demo4(47);
}
}

//output

//G:\Java Programe>javac Demo4.java

//G:\Java Programe>java Demo4
//This is my main method
//This is default constructor
//This is parameter constructor

