package day11funcprog;

import java.util.ArrayList;

public class ConstructorReference {

	public static void main(String[] args) {
		// constructor reference
		BaseInterface list = ArrayList::new;
	}

}
