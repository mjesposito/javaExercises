package day3core;

public class InheritenceExample2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk(); // method from parent Animal class
		dog.eat(); // method from Dog class
		dog.bark(); // method from Dog class
	}
}