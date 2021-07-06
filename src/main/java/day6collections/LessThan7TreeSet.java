package day6collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class LessThan7TreeSet {

	public static void main(String[] args) {
		NavigableSet<Integer> ts = new TreeSet<Integer>();

		ts.add(3);
		ts.add(7);
		ts.add(2);
		ts.add(8);

		// gets all elements less than 7
		System.out.println(ts.headSet(7));
	}

}
