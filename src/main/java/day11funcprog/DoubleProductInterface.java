package day11funcprog;

@FunctionalInterface
public interface DoubleProductInterface {
	// functional interface since there is only one abstract method
	public double product(double a, double b);
}
