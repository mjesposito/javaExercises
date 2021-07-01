package day1core;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		boolean prime = true;
		
		if (num <= 1) {
			prime = false;
		}else if (num == 2){
			prime = true;
		}else if(num % 2 == 0) {
			prime = false;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				prime = false;
			}
		}
		
		if (prime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		

	}

}
