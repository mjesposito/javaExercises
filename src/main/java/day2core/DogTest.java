package day2core;

public class DogTest {

	public static void main(String[] args) {
		Dog d1 = new Dog("Rosie", 4, 50.1);
		
		System.out.println(d1.toString());
		d1.eating();
		d1.eating("Tacos");

	}

}
