package com.corejava.operators;

public class Program2 
{
	public static void main(String[] args)
	{
		String a="ashok";
		int b=10 , c=20 , d=30 ;
		System.out.println(a+b+c+d); //output : ashok102030
		System.out.println(b+c+d+a); //output : 60ashok
		System.out.println(b+c+a+d); //output : 30ashok30
		System.out.println(b+a+c+d); //output : 10ashok 2030
		System.out.println("***********");
		System.out.println(10 < 10.5); //true
		System.out.println('a' > 100.5); //false
		System.out.println('b' > 'a'); //true
		System.out.println("**********");
		System.out.println(10 == 20) ; //false
		System.out.println('a' == 'b' ); //false
		System.out.println('a' == 97.0 ); //true
		System.out.println(false == false); //true
		System.out.println("********");
		Thread t1=new Thread( ) ;
		Thread t2=new Thread( );
		Thread t3=t1 ;
		System.out.println(t1==t2); //false
		System.out.println(t1==t3); //true
		System.out.println("*********");
		Thread t=new Thread( ) ;
		Object o=new Object( );
		String s=new String("durga");
		System.out.println(t ==o); //false
		System.out.println(o==s); //false
		//System.out.println(s==t);(some relation between argument types(child to parent , parent to child) ,
		//Otherwise we will get Compiletime error incompatible types)
		System.out.println("**********");
		String s1= new String("ashok");
		System.out.println(s1==null); //output : false
		String s2=null ;
		System.out.println(s2==null); //true
		System.out.println(null==null); //true
		System.out.println(s1==s2);//false
		System.out.println("**********");
		
	}
}
