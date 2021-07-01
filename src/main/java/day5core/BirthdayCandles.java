package day5core;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {
	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();
		test.add(4);
		test.add(4);
		test.add(1);
		test.add(3);
		System.out.println(birthdayCakeCandles(test));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		// looking for number of tallest candles
		int tallest = 0;
		int height = 0;

		for (int i : candles) {
			// if i is greater than its the new tallest so reset the count
			if (i > height) {
				height = i;
				tallest = 1;
				// if i is the same height then add to the counts
			} else if (i == height) {
				tallest++;
			}
		}

		return tallest;
	}

}
