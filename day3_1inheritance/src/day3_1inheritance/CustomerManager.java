package day3_1inheritance;

public class CustomerManager {
	
	//Müşterinin eklenip sileneceği yer
	
	//kişi ve şirketlerin blgilerini extends ssayessinde referans ile erişeceğiz
	public void add(Customer customer) {
		System.out.println(" ------------------------- ADD ------------------------");
		System.out.println("|" + customer.getCustomerNumber() + " numaralı " + customer.getCustomerNumber() + " eklendi");
		System.out.println(" ------------------------------------------------------");
	}
	
	//BULK_INSERT(Çoklu Eklem İşlemi)
	public void addMultiple(Customer[] customers) {
		for(Customer customer :  customers) {
			add(customer);
		}
	}
	
	
}
