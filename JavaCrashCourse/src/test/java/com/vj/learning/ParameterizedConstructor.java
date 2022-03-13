package com.vj.learning;

public class ParameterizedConstructor {

	String animalName;
	String animalType;

//This is the Parameterized Constructor
	ParameterizedConstructor(String name, String type) {
		animalName = name;
		animalType = type;
	}

//This is a method created to call the datatype value based on the object created
	public void animalDetails() {
		System.out.println("Name of the animal is: " + animalName + " its type is: " + animalType);
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor("Lion", "Alpha Predator");
		ParameterizedConstructor obj2 = new ParameterizedConstructor("Cheetah", "Swift Predator");
		obj1.animalDetails();
		obj2.animalDetails();
	}

}
