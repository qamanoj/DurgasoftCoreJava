package com.Map;

import java.util.HashMap;

public class HashMap3
{
	public static void main(String[] args) {
		HashMap h=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		h.put(i1, "manoj");
		h.put(i2, "kumar");
		System.out.println(h);
		System.out.println(h.get(10));
	}
}
