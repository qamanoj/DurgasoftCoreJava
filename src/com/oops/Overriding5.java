package com.oops;

import java.io.EOFException;
import java.io.FileNotFoundException;

class Overriding5 
{
	 synchronized void marry() throws Exception
	{
		System.out.println("marry parent calss");
	}
}
class Overriding6 extends Overriding5
{
	protected synchronized final strictfp void marry()  throws EOFException,FileNotFoundException,NullPointerException
	{
		System.out.println("marry child calss");
	}
}
