package day6collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<String> list = addAndPrint();
		iterArrList(list);
		reverseArr(list);
		System.out.println(list);

	}

	// exercise 1
	static ArrayList<String> addAndPrint() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("blue");
		list.add("red");
		list.add("green");
		System.out.println(list);

		return list;
	}

	// exercise 2
	static void iterArrList(ArrayList<String> list) {
		for (String color : list) {
			System.out.println(color);
		}
	}

	// exercise 3
	static void reverseArr(ArrayList<String> list) {
		Collections.reverse(list);
	}

}
