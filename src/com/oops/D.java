package com.oops;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class D 
{
	int a=10;
	public static void main(String[] args) throws Throwable
	{
		//D d=new D(); 
		//System.out.println(d.a);
		
		/*D d1=(D)Class.forName("D").newInstance();
		System.out.println(d1.a);*/
		
		/*D d2=new D();
		D d3=(D)d2.clone();
		System.out.println(d3.a);*/
		
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		D t = (D)ois.readObject();
	}
}
