package com.corejava.javalangpackage;

public class Equals1
{
	String name;
	int rollno;
	protected Equals1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object obj)
	{

		String name1=this.name;
		int rollno1=this.rollno;
		Equals1 s2=(Equals1)obj;
		String name2=s2.name;
		int rollno2=s2.rollno;
		if(name1.equals(name2) && rollno1==rollno2)
		{
			return true;
		}
		else return false;
	}
	public static void main(String[] args) 
	{
		Equals1 e=new Equals1("manoj", 100);
		Equals1 e1=new Equals1("kumar", 101);
		Equals1 e2=new Equals1("manoj", 100);
		Equals1 e3=e;
		System.out.println(e.equals(e1));
		System.out.println(e.equals(e2));
		System.out.println(e.equals(e3));
		System.out.println(e.equals("manoj"));
	}
}
