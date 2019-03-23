package com.corejava.exception;

import java.io.IOException;

public class Program3 extends RuntimeException {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		//throw new Program3();
		
		
		//Throws Program3;
		
		
		try
		{
			System.out.println("hii");
		}
		catch(Error e)
		
		{
			e.getMessage();
		}
	}

}
