package day3_1inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer person1 = new IndividualCustomer();
		person1.setCustomerNumber("0");
		person1.setPreName("person");
		
		
		CorparateCustomer company1 = new CorparateCustomer();
		company1.setCustomerNumber("11");
		company1.setPreName("company");
		
		UnionCustomer union1 = new UnionCustomer();
		union1.setCustomerNumber("23");
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {company1,person1,union1};
		
		customerManager.addMultiple(customers);
		
	}

}
