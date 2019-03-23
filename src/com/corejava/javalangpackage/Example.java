package com.corejava.javalangpackage;

public class Example implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{	
		Object o=new String("manoj");
		System.out.println(o.getClass().getName());
	}
}
