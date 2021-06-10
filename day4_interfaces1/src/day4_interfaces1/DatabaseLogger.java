package day4_interfaces1;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("databaseLog: " + "'" + message + "'");
	}

}
