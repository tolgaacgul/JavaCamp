package day4_interfaces1;

public class CustomerManager {
	
	private Logger logger;
	
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}

	
	public void add(Customer customer) {
		System.out.println("------------------ADD----------------");
		System.out.println("Müşteri eklendi: " + customer.getFirstName());
		this.logger.log("Müşteri eklendi: " + customer.getFirstName());
		
		
		System.out.println("-------------------------------------------");
	}
	
	public void delete(Customer customer) {
		System.out.println("-----------------DELETE-------------------");
		System.out.println("Müşteri silindi: " + customer.getFirstName());
		
		
		System.out.println("-------------------------------------------");

	}
}
