package day1core;
import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		
		if (checkSum(n) == 1){
			System.out.println("Sum of odd digits is odd.");
		}else {
		System.out.println("Sum of odd digits is even.");
		}
	}
	
	static int checkSum(String n) {
		int sum = 0;
		int length = String.valueOf(n).length();
		
		for (int i = 0; i < length; i++) {
			int num = n.charAt(i);
			sum += num;
		}
		
		if (sum % 2 == 1) {
			return 1;
		}else {
			return -1;
		}
	}

}
