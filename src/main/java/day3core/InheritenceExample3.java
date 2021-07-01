package day3core;

public class InheritenceExample3 {

	public static void main(String[] args) {
		// create an instance of both parent A and child B
		A a1 = new A(); 
		B b1 = new B();
		
		// Show that they have different names
		System.out.println(a1.name);
		System.out.println(b1.name);
		
		// Show that they both have the same method from parent class A
		System.out.println(a1.getNum());
		System.out.println(b1.getNum());
		
		// a1.helloWorld(); //doesn't work because child method
		// does work because method in class B
		b1.helloWorld();

	}

}
