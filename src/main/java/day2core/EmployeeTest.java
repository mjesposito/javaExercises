package day2core;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Joe", "Smith", -1000);
		Employee e2 = new Employee("Ken", "Heath", 1200);
		
		System.out.println("Employee 1's yearly salary: " + 12*e1.getMonthlySalary());
		System.out.println("Employee 2's yearly salary: " + 12*e2.getMonthlySalary());
		
		double newSalary = e1.getMonthlySalary();
		newSalary = newSalary * 1.10;
		e1.setMonthlySalary(newSalary);
		
		double newSalary1 = e2.getMonthlySalary();
		newSalary1 = newSalary1 * 1.10;
		e2.setMonthlySalary(newSalary1);
		
		System.out.println("Employee 1's yearly salary: " + 12*e1.getMonthlySalary());
		System.out.println("Employee 2's yearly salary: " + 12*e2.getMonthlySalary());
	}

}
