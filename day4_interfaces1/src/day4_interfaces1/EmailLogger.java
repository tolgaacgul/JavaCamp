package day4_interfaces1;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Gönderilerek Loglandı: " + "'" + message + "'");

	}

}
