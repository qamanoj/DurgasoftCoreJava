package com.corejava.collectionframework;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo 
{
	public static void main(String[] args) {

		HashMap h1=new HashMap();
		Integer i=new Integer(10);
		Integer j=new Integer(10);
		h1.put(i, "manoj");
		h1.put(j, "kumar");
		System.out.println(h1);


		IdentityHashMap h=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		h.put(i1, "manoj");
		h.put(i2, "kumar");
		System.out.println(h);
	}
}
