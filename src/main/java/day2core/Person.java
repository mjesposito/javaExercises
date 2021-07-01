package day2core;

public class Person {
	private String name;
	private int age;
	private double shoeSize;
	
	public Person(String name, int age, double shoeSize) {
		super();
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
	}

	private void walking() {
		System.out.println(this.name + " who is " + this.age 
				+ " years old is walking with a shoe size of " + this.shoeSize);
	}
	
	public void startWalking() {
		this.walking();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(double shoeSize) {
		this.shoeSize = shoeSize;
	}
	
}
