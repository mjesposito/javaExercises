package day11funcprog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceStream {

	public static void main(String[] args) {
		Invoice i1 = new Invoice("100", "nails", 4, 0.07);
		Invoice i2 = new Invoice("134", "books", 13, 12.99);
		Invoice i3 = new Invoice("86", "scrap metal", 47, 2.34);
		Invoice i4 = new Invoice("340", "paint", 7, 6.89);
		Invoice i5 = new Invoice("50000", "hat", 1, 8.99);

		List<Invoice> inList = Arrays.asList(i1, i2, i3, i4, i5);
		System.out.println(inList);

		// 6.1
		List<Invoice> sortedDescList = inList.stream().sorted(Comparator.comparing(Invoice::getPartDescription))
				.collect(Collectors.toList());
		System.out.println(sortedDescList);

		// 6.2
		List<Invoice> sortedPPIList = inList.stream().sorted(Comparator.comparingDouble(Invoice::getPricePerItem))
				.collect(Collectors.toList());
		System.out.println(sortedPPIList);

		// 6.3

	}

}
