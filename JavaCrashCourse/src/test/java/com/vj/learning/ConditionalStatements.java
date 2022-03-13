package com.vj.learning;

public class ConditionalStatements {
	String myHeroName = "Spiderman";

	public void heroGuessor() {
		switch (myHeroName) {
		case "Batman":
			System.out.println("Your hero is Batman!");
			break;
		case "Superman":
			System.out.println("Your hero is Superman!");
			break;
		case "Spiderman":
			System.out.println("Your hero is Spiderman!");
			break;
		case "Iron Man":
			System.out.println("Your hero is Iron Man!");
			break;
		case "Thor":
			System.out.println("Your hero is Thor!");
			break;
		default:
			System.out.println("Sorry, I do not know " + myHeroName + "!");
			break;
		}
	}

	public static void main(String[] args) {
		ConditionalStatements check = new ConditionalStatements();
		check.heroGuessor();
	}

}
