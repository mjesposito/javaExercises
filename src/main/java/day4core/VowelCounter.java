package day4core;

public class VowelCounter {

	public static void main(String[] args) {

		// test that uppercase works
		System.out.println(vCounter("HCL TechnologIes"));
		// test no vowels
		System.out.println(vCounter("jhgf"));

	}

	static int vCounter(String string) {
		System.out.println(string);
		int counter = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

		// convert string to lowercase and then into char array
		string = string.toLowerCase();
		char[] charArr = string.toCharArray();

		// loop through each character
		for (int c : charArr) {
			// loop through each vowel
			for (int v : vowels) {
				// if c is a vowel, increment counter
				if (c == v) {
					counter++;
				}
			}

		}

		return counter;
	}

}
