package day2core;

public class Employee {
	
	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMonthlySalary(monthlySalary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
		}
	}
	
	
	
}
