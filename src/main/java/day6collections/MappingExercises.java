package day6collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MappingExercises {

	public static void main(String[] args) {
		// exercise 6
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		System.out.println(map.size());

		// exercise 7
		Set<String> keys = map.keySet();
		System.out.println(keys);
	}

}
