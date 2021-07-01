package day5core;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("abcba"));
		System.out.println(isPalindrome("abcd"));

		System.out.println(isPalindrome("affffttffffa"));

	}

	// Rewrote for better optimization
	static boolean isPalindrome(String string) {
		char[] ch = string.toCharArray();
		int len = string.length();

		// only need to get to the halfway point after the rest has already been checked
		for (int i = 0; i < (len / 2) + 1; i++) {
			if (ch[i] != ch[(len - 1) - i]) {
				return false;
			}
		}
		return true;
	}

	// Original
	// I believe that it is O(n) since it is iterating through each character
	static boolean isPal(String string) {
		// convert string to SB for easy reverse then convert to char array
		StringBuilder sb = new StringBuilder(string);
		StringBuilder reverse = sb.reverse();
		char[] reverseChar = reverse.toString().toCharArray();

		// get a char array of the original
		char[] normalChar = string.toCharArray();

		// iterate through both, on first non match return false
		for (int i = 0; i < string.length(); i++) {
			// needs break so not going through same chars twice
			if (reverseChar[i] != normalChar[i]) {
				return false;
			}
		}

		return true;
	}

}
