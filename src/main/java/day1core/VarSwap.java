package day1core;

public class VarSwap {

	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 34;
		
		System.out.println("Var1: " + var1);
		System.out.println("Var2: " + var2);
		
		int temp = var1;
		var1 = var2;
		var2 = temp;
		
		System.out.println("Var1: " + var1);
		System.out.println("Var2: " + var2);

	}

}
