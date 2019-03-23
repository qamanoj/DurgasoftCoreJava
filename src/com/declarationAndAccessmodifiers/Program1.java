package com.declarationAndAccessmodifiers;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
import static java.lang.Math.*;
import static java.lang.System.out;
import java.sql.*;
import java.util.Date;

public class Program1 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d.getClass().getName());
		System.out.println("*********");
		System.out.println(sqrt(4));
		System.out.println(max(30,20));
		System.out.println(random());
		System.out.println("*******");

		out.println("hello");
		out.println("hi");
		System.out.println("*******");

		System.out.println(MAX_VALUE);
		System.err.println("jj");


	}
}
