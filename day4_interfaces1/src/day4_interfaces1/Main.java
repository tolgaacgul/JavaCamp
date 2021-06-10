package day4_interfaces1;

public class Main {

	public static void main(String[] args) {	
		
		Customer customer0 = new Customer(0, "Engin", "Demiroğ");
		Customer customer1 = new Customer(1,"Tolga", "Açgül");   
		
		Logger[] loggers =  {new DatabaseLogger(), new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		customerManager.add(customer1);
		customerManager.add(customer0);
	}

}
