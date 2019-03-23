package com.declarationAndAccessmodifiers;

interface Inter1 {
	void m();
}
interface Inter2
{
	void m1(int i);
}
class Test implements Inter1,Inter2
{	
	public void m() {
		System.out.println("m method imp..");
	}
	public void m1(int i) {
		System.out.println("m1 method imp..");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m();
		t.m1(10);
	}
}

