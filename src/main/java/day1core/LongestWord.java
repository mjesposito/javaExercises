package day1core;
import java.util.Scanner;

class MainCode{
	
	static String getLargestWord(String sentence) {
		String longest = "";
		
		String[] words = sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if (i == 0) {
				longest = words[i];
			}
			if (longest.length() < words[i].length()) {
				longest = words[i];
			}
		}
		
		
		return longest;
	}
}

public class LongestWord {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		
		MainCode s = new MainCode();
		
		System.out.println(s.getLargestWord(n));

	}

}


