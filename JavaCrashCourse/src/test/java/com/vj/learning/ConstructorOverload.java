package com.vj.learning;

public class ConstructorOverload {
	String mainText;

	ConstructorOverload() {
		System.out.println("This is a No Arguments or Non-Parameterized Constructor.");
		System.out.println(mainText);
	}

	ConstructorOverload(String overloadText) {
		mainText = overloadText;
		System.out.println("This is a Parameterized Constructor.");
		System.out.println(mainText);
	}

	public static void main(String[] args) {
		ConstructorOverload number1 = new ConstructorOverload();
		ConstructorOverload number2 = new ConstructorOverload("BowBow");
	}
}