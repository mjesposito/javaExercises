package day6collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {
	// exercise 8 attempt, need to revist
	public static void main(String[] args) {
		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>();
		tm.put(new Student(1, "Matt"), 11);
		tm.put(new Student(7, "Kelly"), 3);
		tm.put(new Student(4, "Ken"), 57);

		System.out.println(tm);

	}

	class reverseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o2.num, o1.num);
		}

	}

}
