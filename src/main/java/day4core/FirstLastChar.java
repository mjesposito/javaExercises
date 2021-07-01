package day4core;

public class FirstLastChar {

	public static void main(String[] args) {

		String[] array = { "g ojg g", "this", "the picture was great", "K", "Wow" };

		// loop through array checking each string
		for (String s : array) {
			System.out.println(s);
			// print out 1 if their equal, -1 otherwise
			System.out.println(checkCharacters(s));
		}
	}

	// checks to see if first and last character are the same
	static int checkCharacters(String check) {
		// turn the string into an array
		char ch[] = check.toCharArray();
		// get length to find the last character
		int len = check.length();
		// check if first is equal to the last
		if (ch[0] == ch[len - 1]) {
			return 1;
		} else {
			return -1;
		}
	}

}
