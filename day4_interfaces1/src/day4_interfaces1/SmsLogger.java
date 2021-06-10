package day4_interfaces1;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("smsLog: " + "'" + message + "'");
	}

}
