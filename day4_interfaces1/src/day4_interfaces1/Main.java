package day4_interfaces1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer(1,"Tolga", "Açgül");
		
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		
		customerManager.add(customer1);
	}

}
