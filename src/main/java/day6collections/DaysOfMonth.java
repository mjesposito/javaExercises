package day6collections;

public class DaysOfMonth {

	static int[] daysPerMonth = { 31, 0, 31, 30, 31, 20, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		System.out.println(getNumberOfDays(1, 3));
		System.out.println(getNumberOfDays(1, 2));
		System.out.println(getNumberOfDays(100, 2));
		System.out.println(getNumberOfDays(4, 2));
		System.out.println(getNumberOfDays(400, 2));
		System.out.println(getNumberOfDays(2012, 12));
	}

	static int getNumberOfDays(int year, int month) {
		if (month != 2) {
			return daysPerMonth[month - 1];
		} else {
			// leap year logic
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				return 29;
			} else {
				return 28;
			}
		}

	}

}
