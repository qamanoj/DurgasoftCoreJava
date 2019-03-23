package com.corejava.javalangpackage;

public class HashCode1
{
	int i;
	HashCode1(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+" ";
	}
	public int hashCode()
	{
		return i;
	}
	public static void main(String[] args)
	{
		HashCode1 h=new HashCode1(10);
		HashCode1 h1=new HashCode1(100);
		System.out.println(h);
		System.out.println(h1);
	}
}
