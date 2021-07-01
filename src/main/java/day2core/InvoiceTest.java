package day2core;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i1 = new Invoice("AAA", "Scrws", -50, -0.05);
		
		System.out.println("Part#: " + i1.getPartNumber() + 
				"Desc: " + i1.getPartDesc() + "Quatity: " + i1.getQuatity() +
				"Price: " + i1.getPricePerItem());
		System.out.println(i1.getInvoiceAmount());

	}

}
