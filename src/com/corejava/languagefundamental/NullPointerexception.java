package com.corejava.languagefundamental;

public class NullPointerexception 
{
	//int[] a;
	public static void main(String[] args) {
		/*NullPointerexception n=new NullPointerexception();
		System.out.println(n.a);//null
		System.out.println(n.a[0]);//R.E:NullPointerExceptio */	
	
		int a[][]=new int[2][];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[0][0]);
	}
}
