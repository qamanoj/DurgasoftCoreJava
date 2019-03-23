package com.corejava.operators;

public class Program5 
{
	public static void main(String[] args)
	{
		int a , b , c , d ;
		a=b=c=d=20 ;
		a += b-= c *= d /= 2 ;
		System.out.println(a+"**"+b+"**"+c+"**"+d);//-160**-180**200**10
		System.out.println("*******");
		int x=(10>20)?30:40;
		System.out.println(x); //40
		int x1=(10>20)?30:((40>50)?60:70);
		System.out.println(x1); //70
		System.out.println("*******");
		
		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));
	}
	public static int m1(int i) 
	{
		System.out.println(i);
		return i;
	}
}
