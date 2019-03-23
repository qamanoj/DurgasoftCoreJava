package com.corejava.flowcontrol;

public class DoWhile 
{
	public static void main(String[] args) 
	{
		/*do                               (it should be execute infinite times)
			System.out.println("hello");						hello.....
		while(true);    */
		
		
		
		/*do; 								 (it should be compile successfully)
		while(true); */
		
		
		
		/*do  									(it should be compile successfully)
		{
		int x=10;
		}
		while(true);*/
		
		
		
		/*do while(true) 						(it should be execute infinite times)
			System.out.println("hello");						hello.....
			while(true);*/
		
		do
		{
		System.out.println("hello");
		}
		while(false);
		System.out.println("hi");
		
		System.out.println("*****");
		
		/*int a=10,b=20;   							(it should be execute infinite times)
		do
		{														hello.....
		System.out.println("hello");					
		}
		while(a<b);
		System.out.println("hi");*/
		
		int a=10,b=20;
		do
		{
		System.out.println("hello");
		}
		while(a>b);
		System.out.println("hi");
		
		System.out.println("*****");
		
		/*final int a1=10,b1=20;  (compile time error ,unreachable statement)
		do
		{
		System.out.println("hello");
		}
		while(a1<b1);
		System.out.println("hi");
		*/
		final int aa=10,bb=20;
		do
		{
		System.out.println("hello");
		}
		while(aa>bb);
		System.out.println("hi");
		
		System.out.println("*****");
		
		
	}
}
