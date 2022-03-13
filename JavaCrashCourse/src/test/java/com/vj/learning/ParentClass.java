package com.vj.learning;

public class ParentClass {
	ParentClass() {
		System.out.println("This is the Parent Class's Non-Parameterized Constructor.");
	}
	ParentClass(String text) {
		System.out.println("This is the Parent Class's Parameterized Constructor: "+text);
	}
}
