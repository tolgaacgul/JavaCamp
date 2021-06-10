package day4_interfaces1;

public class CustomerManager {
	
	private Logger logger;
	private Logger[] loggers;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}


	public void add(Customer customer) {
		System.out.println("------------------ADD----------------");
		System.out.println("Müşteri eklendi: " + customer.getFirstName());
//		this.logger.log("Müşteri eklendi: " + customer.getFirstName());
		
//Static bir method olduğu için direk sınıf isminden çağırdık. new lemeye gerek kalmadı 
		Utils.runLoggers(loggers, customer.getFirstName());
		
		System.out.println("-------------------------------------------");
	}
	
	public void delete(Customer customer) {
		System.out.println("-----------------DELETE-------------------");
		System.out.println("Müşteri silindi: " + customer.getFirstName());
		
		
		System.out.println("-------------------------------------------");

	}
}
