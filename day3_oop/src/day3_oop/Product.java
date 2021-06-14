package day3_oop;

public class Product {
	
	//encapsulation
	private int id;
	private String name;
	private double unitPrice;
	private double discount;
	 
	//final sacede constructorda set edilmesini sağlar
	//private sadece bu class'tan erişilebilir demek(daha geniş.)
	 
	
	//--------------------Constructor-------------
	public Product() {//referansı bellekte çalıştırdığında çalışan ilk kodlar
		System.out.println("parametresiz constuctor çalıştı");
	}
	public Product(int id, String name, double unitPrice, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
	}

	
	//-----------------Getter Setter -------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	//field alanında tanımlanmadı fakat indirim halini göstermek için yayınlıyoruz
	public double getUnitPriceAfterDiscount() {
		return ( this.unitPrice - ( this.unitPrice * this.discount / 100 ));
	}
	
	

}
