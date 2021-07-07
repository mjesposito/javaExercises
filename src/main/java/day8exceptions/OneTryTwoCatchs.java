package day8exceptions;

public class OneTryTwoCatchs {

	public static void main(String[] args) {
		String[] drinks = { "juice", "milk", "water", null };
		int index = 10;

		System.out.println("Beginning");

		// if an exception is caught, breaks out of try and continues program
		try {
			System.out.println("The drink is " + drinks[index]);

			System.out.println("The last drink is " + drinks[drinks.length - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Exception");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

		System.out.println("End");
	}

}
