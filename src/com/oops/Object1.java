package com.oops;

public class Object1 
{
	/*static int a=10;
	static
	{										(valid)
		System.out.println(a);
		System.exit(0);
	}*/



	/*static
	{
		System.out.println(a);  (cte-illigal forward refarence)
	}
	static int a=10;*/



	/*static
	{
		m();
	}										(valid)
	public static void m()
	{
		System.out.println(a);
	}
	static int a=10;*/


	/*static 
	{
		System.out.println("hello");       (valid)
		System.exit(0);
	}*/



	/*static int a=m();
	public static int m()
	{
		System.out.println("hello");			(valid)
		System.exit(0);
		return 10;
	}*/


	/*static Object1 t=new Object1();
	Object1()
	{
		System.out.println("hello i can print");			(valid)
		System.exit(0);
	}*/


	/*static Object1 t=new Object1();
	{
	System.out.println("hello i can print");				(valid)
	System.exit(0);
	}*/


	public static void main(String[] args)
	{
		System.err.println("hello and hii");
	}
}
