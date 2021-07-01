package day4core;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		String[] options = { "add", "subtract", "multiply", "divide", "square", "square root" };

		System.out.println("Welcome to the basic calculator!");
		System.out.println("Your options are to:\n");
		for (String o : options) {
			System.out.printf("-%s\n", o);
		}
		System.out.println("\nTo exit type quit as command\n");

		// loop to keep using calculator after operations
		while (true) {
			System.out.println("Please input the function as above: ");
			Scanner in = new Scanner(System.in);
			String command = in.nextLine();
			if ("quit".equals(command)) {
				break;
			}
			/*
			 * To improve class, these should be moved into functions method then each
			 * function should store a previous value and work based of that instead of
			 * limiting two integers
			 */
			System.out.println("The first integer: ");
			int i1 = in.nextInt();
			System.out.println("The second integer: ");
			int i2 = in.nextInt();

			functions(command, i1, i2);
		}

	}

	static void functions(String command, int i1, int i2) {

		// switch to check and run command
		switch (command) {
		case "add":
			System.out.println(Math.addExact(i1, i2));
			break;
		case "subtract":
			System.out.println(Math.subtractExact(i1, i2));
			break;
		case "multiply":
			System.out.println(Math.multiplyExact(i1, i2));
			break;
		case "divide":
			System.out.println(Math.floorDiv(i1, i2));
			break;
		case "square":
			System.out.println(Math.pow(i1, i2));
			break;
		case "square root":
			System.out.println(Math.sqrt(i1));
			break;

		default:
			System.out.println("Not a command");
		}
	}

}
