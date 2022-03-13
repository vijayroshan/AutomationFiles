package com.vj.learning;

public class ChildClass extends ParentClass {

	ChildClass() {
		System.out.println("This is the Child Class's Non-Parameterized Constructor.");
	}
	ChildClass(String text) {
		System.out.println("This is the Child Class's Parameterized Constructor: "+text);
	}
	public static void main(String[] args) {
		ParentClass parent = new ParentClass("Parent's Hello!");
		ChildClass child = new ChildClass("Child's Heyy!");
	}

}
