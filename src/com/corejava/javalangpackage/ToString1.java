package com.corejava.javalangpackage;

import java.util.ArrayList;

public class ToString1 
{
	String name;
	int rollno;
	public ToString1(String name,int rollno) 
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String toString()
	{
		return "my name is "+name+" and rollno is "+rollno;
	}
	public static void main(String[] args) 
	{
		ToString1 t=new ToString1("manoj",100);
		ToString1 t1=new ToString1("kumar",101);
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t1);
		
		System.out.println("*******");
		
		String s=new String("manoj");
		System.out.println(s);
		Integer i=new Integer(10);
		System.out.println(i);
		ArrayList a=new ArrayList();
		a.add('A');
		a.add('B');
		System.out.println(a);
	}
}
