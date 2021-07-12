package day11funcprog;

import java.util.Arrays;
import java.util.List;

public class TypedQuestions {

	public static void main(String[] args) {
		/*
		 * 2 - the filter assigns a boolean value to each element then calls the sum()
		 * method which is undefined for streams as show in the next example must use a
		 * method like reduce which has an accumulator
		 * 
		 * 3 - first the list is turned into a stream then for each element value in the
		 * list take the modulo of 2 if it is not equal to zero (odd) return true
		 * removes all elements that are 0 from the filter sums the integers left in the
		 * list
		 * 
		 * 4 - random is filled with 1000000 integers from and including 1 below 3 boxed
		 * convert the stream of integers into a list of integers now that is a
		 * collection group the numbers by which number they are and count them for each
		 * number print out the number and its frequency
		 */

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer sum = list.stream().filter(value -> value % 2 != 0).reduce(0, Integer::sum);
		System.out.println(sum);

		/*
		 * List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); Integer
		 * sum = list.stream().filter(value -> value % 2 != 0).sum();
		 * System.out.println(sum);
		 */

	}

}
