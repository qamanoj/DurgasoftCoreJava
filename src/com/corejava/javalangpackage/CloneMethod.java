package com.corejava.javalangpackage;

public class CloneMethod implements Cloneable
{
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneMethod c=new CloneMethod();
		
		CloneMethod c1=(CloneMethod)c.clone();
		
		c1.i=222;
		c1.j=333;
		
		System.out.println(c.i+"-----"+c.j);
		
		System.out.println(c1.i+"-----"+c1.j);
	}
}
