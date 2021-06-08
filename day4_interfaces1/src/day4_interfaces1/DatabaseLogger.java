package day4_interfaces1;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Veri Tabanına Loglandı: " + "'" + message + "'");
	}

}
