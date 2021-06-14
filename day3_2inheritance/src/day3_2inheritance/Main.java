package day3_2inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//alternatifler if ile sunulmaz. Hata verdirir.
//		LogManager logManager = new LogManager();
//		logManager.log(1);
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());
		customerManager.add(new FileLogger());
	}

}
