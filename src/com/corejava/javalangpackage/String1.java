package com.corejava.javalangpackage;

public class String1 
{
	public static void main(String[] args) 
	{
		String s1=new String("you cannot change me!");
		String s2=new String("you cannot change me!");
		System.out.println(s1==s2);//false
		String s3="you cannot change me!";
		System.out.println(s1==s3);//false
		String s4="you cannot change me!";
		System.out.println(s3==s4);//true
		String s5="you cannot "+"change me!";
		System.out.println(s3==s5);//true
		String s6="you cannot ";
		String s7=s6+"change me!";
		System.out.println(s3==s7);//false
		final String s8="you cannot ";
		String s9=s8+"change me!";
		System.out.println(s3==s9);//true
		System.out.println(s6==s8);//true

		System.out.println("***********");

		String s=new String("manoj");
		String ss=s.intern();
		System.out.println(s==ss);
		String sss="manoj";
		System.out.println(ss==sss);

		System.out.println("********");

		String str="java";
		System.out.println(str.equals("JAVA"));
		System.out.println(str.equalsIgnoreCase("java"));

		System.out.println("********");

		String str1="javadevloper";
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(3,8));
		
		System.out.println("********");
		
		System.out.println(str1.replace('a', 'e'));
		
		System.out.println("********");
		
		String s11=new String("spring");
		s11.concat("fall");
		s11=s11+"winter";
		String s22=s11.concat("summer");
		System.out.println(s11);
		System.out.println(s22);
		
		System.out.println("*********");
		
		char[] ch={'a','b','c'} ;
		String st=new String(ch);
		System.out.println(st);//abc
		
		System.out.println("************");
		
		byte[] b={100,101,102};
		String sb=new String(b);
		System.out.println(sb);//def
		
		System.out.println("*********");
		
		
		
	}
}
