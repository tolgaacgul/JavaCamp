package day4_interfaces;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " adlı müşteri eklendi!");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log("'" + customer.getFirstName() + " sisteme eklendi.'");
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + "adlı kişi silindi!");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "silinmesi loglandı!");
	}
}
