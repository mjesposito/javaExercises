package day5core;

import java.util.ArrayList;
import java.util.Stack;

public class EnclosingBalance {

	public static void main(String[] args) {

		System.out.println(isBalanced("[]"));
		System.out.println(isBalanced("[([])]"));
		System.out.println(isBalanced("[{]"));
		System.out.println(isBalanced("]"));
		System.out.println(isBalanced("(())(}"));

	}

	static boolean isBalanced(String string) {
		// using a character stack because all brackets are paired
		Stack<Character> stk = new Stack<Character>();

		// using arraylists for easy contains feature
		ArrayList<Character> left = new ArrayList<Character>();
		left.add('{');
		left.add('[');
		left.add('(');
		left.add('<');
		ArrayList<Character> right = new ArrayList<Character>();
		right.add('}');
		right.add(']');
		right.add(')');
		right.add('>');

		char[] ch = string.toCharArray();

		// loop through each char from given string
		for (char c : ch) {
			// if a left push to stack
			if (left.contains(c)) {
				stk.push(c);
				// if a right pop stack
			} else if (right.contains(c)) {
				// if right and stack is empty right without a left pair, return false
				if (stk.empty()) {
					return false;
				} else {
					// if stack not empty get top left
					char leftSide = stk.pop();
					// get index of left to find pair in right
					int index = left.indexOf(leftSide);
					// if pair doesn't match return false
					if (right.get(index) != c) {
						return false;
					}
				}
			}
		}

		return true;
	}

	/*
	 * psudo code take string input (change to file later) add to stack the left
	 * side enclosing characters on right enclosing, pop stock if not matching
	 * return false else continue until the stack is empty
	 */

}
