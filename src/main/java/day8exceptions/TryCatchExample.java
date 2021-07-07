package day8exceptions;

public class TryCatchExample {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4 };

		int index = 4;

		System.out.println("Start Program");

		try {
			System.out.format("Value at index %d is %d\n", index, intArr[index]);
		} catch (Exception e) {
			System.out.println("Exception occured");

			System.out.println("The exception class: " + e.getClass());
			System.out.println("The exception message: " + e.getMessage());
			System.out.println("The exception loc message: " + e.getLocalizedMessage());
			System.out.println("The exception cause: " + e.getCause());
		}

		System.out.println("End Program");

	}

}