package day4_interfaces1;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("emailLog: " + "'" + message + "'");
	}

}
