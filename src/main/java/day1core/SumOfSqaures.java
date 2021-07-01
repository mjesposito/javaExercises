package day1core;
import java.util.Scanner;

public class SumOfSqaures {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		UserMainCode s = new UserMainCode();
		
		System.out.println(s.sumOfSqauresOfEvenDigits(num));
		
	}

}

class UserMainCode{
	
	static int sumOfSqauresOfEvenDigits(int n) {
		int sum = 0;
		int remainingNum = n;
		int lastDigit = 0;
		
		while (remainingNum > 0) {
			lastDigit = remainingNum % 10;
			remainingNum = remainingNum / 10;
			
			if (lastDigit % 2 == 0) {
				sum += (lastDigit*lastDigit);
			}
		}
		
        return sum;
	}
	
}
