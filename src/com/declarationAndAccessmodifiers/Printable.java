package com.declarationAndAccessmodifiers;

public interface Printable 
{
	void print();  
}  
class A6 implements Printable
{  
	public void print()
	{
		System.out.println("Hello");
	}  

	public static void main(String args[])
	{  
		A6 obj = new A6();  
		obj.print();  
	}  
}
