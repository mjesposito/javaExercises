package day2core;

public class Dog {
	String name;
	int age;
	double weight;
	
	public Dog(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.showExcitement(1);
	}
	
	@Override
	public String toString() {
		return this.name + " is " +this.age + " years old and weights "+ 
				this.weight + " lbs.";
	}
	
	public void showExcitement() {
		System.out.println(this.name + " is wagging its tail!!!");
	}
	
	public void showExcitement(int levelOfExcitement) {
		switch (levelOfExcitement) {
		case 0: System.out.println(this.name + " is not happy.");break;
		case 1: System.out.println(this.name + " wants to play."); break;
		case 2: System.out.println(this.name + " is super excited!"); break;
		}
	}
	
	public void eating() {
		System.out.println("Eating!");
	}
	
	public void eating(String food) {
		System.out.println("Eating " + food + ".");
	}
	
	
	
}
