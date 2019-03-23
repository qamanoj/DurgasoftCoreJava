package com.oops;

class Animal  
{
	
}
class Monkey extends Animal
{
	
}
 public class Test
{
	public void m(Animal a)
	{
		System.out.println("animal");
	}
	public void m(Monkey mon)
	{
		System.out.println("monkey");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		Animal a=new Animal();
		t.m(a);
		Monkey m=new Monkey();
		t.m(m);
		Animal an=new Monkey();
		t.m(an);
	}
}
