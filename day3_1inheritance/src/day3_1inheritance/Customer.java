package day3_1inheritance;

public class Customer {
	private int id;
	private String customerNumber;
	private String preName;
	
	
	public int getId() {
		return id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public String getPreName() {
		return preName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public void setPreName(String preName) {
		this.preName = preName;
	}
}
