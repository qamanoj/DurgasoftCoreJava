package com.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 
{
	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put("manoj",100);
		h.put("manoj",200);
		System.out.println(h);
		System.out.println(h.get("manoj"));
		Map m=Collections.synchronizedMap(h);	
		System.out.println(m);
	}
}
