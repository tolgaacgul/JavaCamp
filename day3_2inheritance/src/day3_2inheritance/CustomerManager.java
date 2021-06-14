package day3_2inheritance;

public class CustomerManager {
	public void add(Logger logger) {
		System.out.println("-----------ADD------------");

	//müşteri ekleme kodları
		System.out.println("  1. İşlem");
		System.out.println("Müşteri Eklendi!");
		
		
	//Loglama(kodları) işlemini çağır 
		//DatabaseLogger logger = new DatabaseLogger(); //Bunun yerine parametre ile alsın
		System.out.println("  2. İşlem");
		logger.log();
		System.out.println("------------------------");
	}
}
