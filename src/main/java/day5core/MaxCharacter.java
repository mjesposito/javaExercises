package day5core;

import java.util.HashMap;
import java.util.Map;

public class MaxCharacter {

	public static void main(String[] args) {
		System.out.println(maxCharacter("aaafbbbdeeeda"));
		System.out.println(maxCharacter("eeddfssses"));
	}

	static int maxCharacter(String string) {
		// convert the string to make indexing easier
		char[] ch = string.toCharArray();
		// create a hashmap for lookup using the char as a key
		Map<Character, int[]> map = new HashMap<Character, int[]>();
		// loop through string
		for (int i = 0; i < ch.length; i++) {
			// if the character is already in the map increase occurrence value
			if (map.containsKey(ch[i])) {
				// get value array
				// increase occurrence
				// set new value
				int[] curArr = map.get(ch[i]);
				curArr[1] = curArr[1] + 1;
				map.put(ch[i], curArr);
				// if the character isn't in map, make a new entry
			} else {
				// create an array { index, occurrence vale}
				int[] newArr = { i, 1 };
				map.put(ch[i], newArr);
			}
		}
		int max = 0;
		int index = 0;
		// loop through entries
		for (Map.Entry<Character, int[]> e : map.entrySet()) {
			// find the largest occurrence value
			int[] maxArr = e.getValue();
			if (maxArr[1] > max) {
				max = maxArr[1];
				index = maxArr[0];
			}
		}
		// return the index of the first found character
		return index;
	}

	/*
	 * psudo code covert string to char array for easy reading loop through each
	 * char create empty map if its a new char add char to map as key set value to
	 * index and occurrence else increase occurrence value find largest occurrence
	 * value return value
	 */

}
