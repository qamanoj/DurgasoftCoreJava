package com.corejava.javalangpackage;

public class Sample 
{
	int i;
	Sample(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
	}
	public static void main(String[] args)
	{
		Sample t1=new Sample(10);
		Sample t2=new Sample(100);
		System.out.println(t1);
		System.out.println(t2);
	}
}
