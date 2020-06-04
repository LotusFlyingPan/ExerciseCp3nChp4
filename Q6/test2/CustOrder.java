package test2;

public class CustOrder {
	
	private String custName;
	private String contactNumber;
	private Date weddingDate;
	private int numberOfGuest;
	private char custPackage; // A/B/C
	// A = RM30,000 , B = RM25,000, C = RM15,000
	

	public CustOrder() {
		this.custName = null;
		this.contactNumber = null;
		this.weddingDate = null;
		this.numberOfGuest = 0;
		this.custPackage = 0;
	}
	/**
	 * @param custName
	 * @param contactNumber
	 * @param weddingDate
	 * @param numberOfGuest
	 * @param custPackage
	 */
	public CustOrder(String custName, String contactNumber, Date weddingDate, int numberOfGuest, char custPackage) {
		this.custName = custName;
		this.contactNumber = contactNumber;
		this.weddingDate = weddingDate;
		this.numberOfGuest = numberOfGuest;
		this.custPackage = custPackage;
	}
	
	public double calcTotal() {
		double total = 0;
		double discount = 0;
		if(this.numberOfGuest > 1000) {
			discount = 0.1;
		}
		if(this.custPackage == 'A') {
			total = 30000 * this.numberOfGuest;
		}else if(this.custPackage == 'B') {
			total = 25000 * this.numberOfGuest;
		}else if(this.custPackage == 'C') {
			total = 15000 * this.numberOfGuest;
		}
		total = total - (total*discount);
		return total;
	}
	
	public String toString() {
		return "custOrder [custName=" + custName + ", contactNumber=" + contactNumber + ", weddingDate=" + weddingDate
				+ ", numberOfGuest=" + numberOfGuest + ", custPackage=" + custPackage + ", calcTotal()=" + calcTotal()
				+ "]";
	}
	

}
