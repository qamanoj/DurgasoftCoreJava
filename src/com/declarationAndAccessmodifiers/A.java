package com.declarationAndAccessmodifiers;

class Parent {
	Parent() {
		System.out.println(this.hashCode());
	}
}

class Child extends Parent {
	Child() {
		System.out.println(this.hashCode());
	}
}

public class A {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.hashCode());
	}
}
