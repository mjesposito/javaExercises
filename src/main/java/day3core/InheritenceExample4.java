package day3core;

public class InheritenceExample4 {

	public static void main(String[] args) {

		Dog4 dog = new Dog4();
		Animal4 animal = new Animal4();

		// private not visible error
		// System.out.println(dog.furColor);
		// dog.makeNoise();

		// public getters and setters allow us to interact with private variables
		System.out.println(dog.getFurColor());
		dog.setFurColor("Green");
		System.out.println(dog.getFurColor());

		// showing that in the dog class makeNoise gets overridden
		System.out.println(animal.makeNoise("Noise"));
		System.out.println(dog.makeNoise("Dog"));
	}

}
