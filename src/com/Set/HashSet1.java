package com.Set;

import java.util.HashSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(true);
		h.add(10);
		System.out.println(h.add("Z"));//false
		System.out.println(h);//[null, B, C, D, Z, 10, true]
	}

}
