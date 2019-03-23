package com.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Arraylist1
{
	public static void main(String[] args) 
	{	
			ArrayList a=new ArrayList();
			a.add("A");
			a.add(10);
			a.add("A");
			a.add(null);
			System.out.println(a);//[A, 10, A, null]
			a.remove(2);
			System.out.println(a);//[A, 10, null]
			a.add(2,"m");
			a.add("n");
			a.set(3, "A");
			System.out.println(a);//[A, 10, m, A, n]
			System.out.println(a.size());
			System.out.println(a.indexOf(10));
			System.out.println(a.lastIndexOf("n"));
			
			System.out.println("********");
			
			ArrayList a1=new ArrayList();
			LinkedList a2=new LinkedList();
			HashMap h=new HashMap<>();
			System.out.println(a1 instanceof Serializable ); //true
			System.out.println(a1 instanceof Cloneable); //true
			System.out.println(a1 instanceof RandomAccess); //true
			System.out.println(a2 instanceof Serializable); //true
			System.out.println(a2 instanceof Cloneable); //true
			System.out.println(a2 instanceof RandomAccess); //false
			System.out.println(h instanceof Serializable); //true
			System.out.println(h instanceof Cloneable); //true
			System.out.println(h instanceof RandomAccess); //false
			
			System.out.println("*********");
			List l=Collections.synchronizedList(a1);
			System.out.println(l);
			
			
	}
}
