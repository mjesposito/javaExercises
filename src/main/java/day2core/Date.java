package day2core;

public class Date {
	int month;
	int day;
	int year;
	
	public Date(int month, int day, int year) {
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
	}
	
	public void displayDate() {
		System.out.println(this.getMonth() + "/" + this.getDay() + "/" 
				+ this.getYear());
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
