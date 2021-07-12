package day11funcprog;

public class Invoice {
	String partNumber;
	String partDescription;
	int quanity;
	double pricePerItem;

	Invoice(String partNumber, String partDescription, int quanity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quanity = quanity;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		return this.partNumber + " " + this.partDescription + " " + this.quanity + " " + this.getPricePerItem();
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

}
