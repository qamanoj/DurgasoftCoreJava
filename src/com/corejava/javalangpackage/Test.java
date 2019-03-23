package com.corejava.javalangpackage;

public class Test 
{
	public static void main(String[] args) {
		
	
	StringBuffer sb=new StringBuffer("saicharankumar");
	System.out.println(sb);//saicharankumar
	sb.delete(6,13);
	System.out.println(sb);//saichar
	sb.deleteCharAt(5);
	System.out.println(sb);//saichr
	}
}
