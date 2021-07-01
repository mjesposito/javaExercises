package day3core;

public class Dog4 extends Animal4{
	//exercise 5
	@Override
	public Dog4 makeNoise(String noise) {
		System.out.println("The dog is making noise.");
		return this;
	}
}
