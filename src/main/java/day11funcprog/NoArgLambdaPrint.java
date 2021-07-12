package day11funcprog;

public class NoArgLambdaPrint {

	public static void main(String[] args) {
		// no argument lambda string that prints a string
		BaseInterface bi1 = () -> {
			System.out.println("Here is a lambda String");
		};
		bi1.sayMessage();

	}

}
