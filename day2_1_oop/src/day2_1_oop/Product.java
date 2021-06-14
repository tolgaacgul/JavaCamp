package day2_1_oop;

public class Product {

	int id;
	String name;
	double unitPrice;
	String detail;
	

	public Product() {
		System.out.println("Yapıcı fonk çalıştı");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
}
