package day6collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendar {

	public static void main(String[] args) {
		getCurrentDate();
		String[] dateTime = extractDateTime();
		// dateTime[0] -> date
		// dateTime[1] -> time
	}

	// exercise 9
	static void getCurrentDate() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}

	// exercise 10
	static String[] extractDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		String strDateTime = now.format(formatter);
		String[] dt = strDateTime.split("T");

		return dt;
	}

}
