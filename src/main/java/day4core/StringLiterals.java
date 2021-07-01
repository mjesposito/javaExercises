package day4core;

public class StringLiterals {
	public static void main(String[] args) {
		// Use string to create two references to cat
		String cat1 = "Cat";
		String cat2 = "Cat";

		// check if they're references are equal with a ternary operator
		System.out.println(cat1 == cat2 ? true : false);

		// create a new string with the String class
		cat1 = new String("Cat");

		// check if new string is equal to reference
		System.out.println(cat1 == cat2 ? true : false);

		// use string builder to make another new string
		StringBuilder cat3 = new StringBuilder(cat1);

		// append to cat3
		cat3.append("3 is appendable!");

		// show that stringbuilder/stringbuffer are mutable
		System.out.println(cat3);

		// Type String isn't immutable
		// cat1.append()

	}

}
