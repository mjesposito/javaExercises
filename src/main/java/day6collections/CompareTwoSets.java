package day6collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 55, 68, 100, 1, 4 };
		Integer[] b = { 42, 12, 42, 1, 100, 122 };

		Set<Integer> setA = new HashSet<Integer>();
		setA.addAll(Arrays.asList(a));
		Set<Integer> setB = new HashSet<Integer>();
		setB.addAll(Arrays.asList(b));

		Set<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println(intersection);

	}

}
