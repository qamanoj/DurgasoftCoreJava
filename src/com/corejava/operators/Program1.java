package com.corejava.operators;

public class Program1 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=++x;
		System.out.println(y);
		
		char ch='a';
		char ch1=++ch;
		System.out.println(ch1);
		
		double d=10.5;
		double d1=++d;
		System.out.println(d1);
		
		byte b=10;
		b++;
		System.out.println(b);
		
		System.out.println('a' + 'b'); // output : 195
		System.out.println('a' + 1); // output : 98
		System.out.println('a' + 1.2); // output : 98.2
		System.out.println(10/0.0); // output : infinity
		System.out.println(-1.7/1.0); //-1.7
		System.out.println(-10/0.0);// output : - infinity
		//System.out.println(0/0); // output RE : ArithmeticException / by zero
		System.out.println(0.0/0.0); // output : NaN
		System.out.println(-0.0/0.0); // output : NaN
		System.out.println(10 < Float.NaN ); // false
		System.out.println(10 <= Float.NaN ); // false
		System.out.println(10 > Float.NaN ); // false
		System.out.println(10 >= Float.NaN ); // false
		System.out.println(10 == Float.NaN ); // false
		System.out.println(Float.NaN == Float.NaN ); // false
		System.out.println(10 != Float.NaN ); //true
		System.out.println(Float.NaN != Float.NaN ); //true
		System.out.println(-0.0/10);
	}
}
