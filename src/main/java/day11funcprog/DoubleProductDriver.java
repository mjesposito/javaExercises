package day11funcprog;

public class DoubleProductDriver {

	public static void main(String[] args) {
		// use functional interface as a guide and give use through lambda expression
		DoubleProductInterface dp1 = (var1, var2) -> (var1 * var2);
		// call product from interface which uses logic from above ^
		double result = dp1.product(4.712, 6.321);
		System.out.println(result);

	}

}
