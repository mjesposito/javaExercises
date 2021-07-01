package day1core;
import java.util.Scanner;

public class CommandLineArg {

	public static void main(String[] args) {
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		while (true) {
			//int a = in.nextInt();
			sum +=  in.nextInt();
			System.out.println("Sum: " + sum);
		}

	}

}
