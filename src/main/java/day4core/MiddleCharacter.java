package day4core;

public class MiddleCharacter {

	public static void main(String[] args) {

		System.out.println(middleChar("267"));
		System.out.println(middleChar("2359"));

	}

	static String middleChar(String string) {
		String middle;

		// convert string to char to easily index
		char[] ch = string.toCharArray();

		// get length and find middle index
		int len = string.length();
		int midNum = len / 2;

		// if odd take the value of char on the middle index and set that to middle
		if (len % 2 == 1) {
			middle = String.valueOf(ch[midNum]);
		} else {
			// create a StringBuilder to add the two middle characters
			StringBuilder twoChar = new StringBuilder();
			// add the left middle char
			twoChar.append(ch[midNum - 1]);
			// add the right middle char
			twoChar.append(ch[midNum]);
			// convert back to string
			middle = twoChar.toString();
		}

		return middle;
	}

}
