package day2core;

public class Invoice {

	private String partNumber;
	private String partDesc;
	private int quatity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDesc, 
			int quatity, double pricePerItem) {
		this.setPartNumber(partNumber);
		this.setPartDesc(partDesc);
		this.setQuatity(quatity);
		this.setPricePerItem(pricePerItem);
	}
	
	public double getInvoiceAmount() {
		double total = 0;
		
		total = this.pricePerItem * this.quatity;
		
		return total;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		if (quatity < 0) {
			this.quatity = 0;
		}else {
			this.quatity = quatity;
		}
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0) {
			this.pricePerItem = 0;
		}else {
			this.pricePerItem = pricePerItem;
		}
	}

}

