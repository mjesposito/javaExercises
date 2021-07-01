package day1core;

public class HelloWorld {

	public static void main(String[] args) {
		
		int count = 0;
		
		while (++count < 10) {
			System.out.println("Count: " + count);
			//++count;
		}
		
		int[] intArray = new int[10];
		intArray[0] = 7;
		intArray[4] = 18;
		
		int[] secondArray = {9,18,25,2,8};
		
		//for-each
		for(int e: secondArray) {
			System.out.println("e=" + e);
		}
		
	}

}
