package com.oops;

public class Constructor 
{
	static int count=0;
	{
		count++; //instance block
	}
	Constructor()
	{
		System.out.println("zero cunstructor");
	}
	Constructor(int i)
	{
		System.out.println("int constructor");
	}
	public static void main(String[] args)
	{
		Constructor t1=new Constructor();
		Constructor t2=new Constructor(10);
		Constructor t3=new Constructor();
		System.out.println(count);//3
	}
}
